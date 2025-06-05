fun queensAttackImproved(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
    if (r_q > n || c_q > n || r_q < 0 || c_q < 0) {
        throw IllegalArgumentException("Invalid queen position $r_q, $c_q for board size $n")
    }

    val obstaclesSet = obstacles.map { it[0] to it[1] }.toSet()

    val directions = listOf(
        Pair(0, -1),  // Left
        Pair(0, 1),   // Right
        Pair(-1, 0),  // Up
        Pair(1, 0),   // Down
        Pair(1, -1),  // Down-Left
        Pair(1, 1),   // Down-Right
        Pair(-1, -1), // Up-Left
        Pair(-1, 1)   // Up-Right
    )

    var validMoves = 0

    for ((direction1, direction2) in directions) {
        var row = r_q + direction1
        var col = c_q + direction2
        while (row in 1 .. n && col in 1 .. n) {
            if (obstaclesSet.contains(Pair(row, col))) {
                break
            }
            validMoves++
            row += direction1
            col += direction2
        }
    }

    return validMoves
}

fun main(args: Array<String>) {
    val result = queensAttackImproved(8, 0, 4, 4, arrayOf())

    println(result)
}
