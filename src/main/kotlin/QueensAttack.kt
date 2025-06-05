fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
    if (r_q > n || c_q > n || r_q < 0 || c_q < 0) {
        throw IllegalArgumentException("Invalid queen position $r_q, $c_q for board size $n")
    }

    val obstaclesSet = obstacles.map { it[0] to it[1] }.toSet()
    var validMoves = 0

    val board = Array(n) { Array<String>(n) { "  " } }
    board[n - r_q][c_q - 1] = " Q"

    obstaclesSet.forEach { it ->
        board[n - it.first][it.second - 1] = "X"
    }

    // Left
    var col = c_q
    while (col >= 1) {
        col--
        if (obstaclesSet.contains(Pair(r_q, col))) {
            break
        }

        validMoves++
        board[n - r_q][col] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    // Right
    col = c_q - 1
    while (col < n - 1) {
        col++
        if (obstaclesSet.contains(Pair(r_q, col))) {
            break
        }
        validMoves++
        board[n - r_q][col] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    col = c_q - 1

    // Down
    var row = r_q
    while (row < n - 1) {
        row++
        if (obstaclesSet.contains(Pair(row, col))) {
            break
        }
        validMoves++
        board[row][col] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    // Up
    row = r_q
    while (row >= 1) {
        row--
        if (obstaclesSet.contains(Pair(row, col))) {
            break
        }

        validMoves++
        board[row][c_q] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    row = r_q

    // Down-Left
    while (row < n && col > 1) {
        row++
        col--
        if (obstaclesSet.contains(Pair(row, col))) {
            break
        }
        validMoves++
        board[row][col] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    // Down-Right
    row = r_q
    col = c_q
    while (row < n - 1 && col < n - 1) {
        row++
        col++
        if (obstaclesSet.contains(Pair(row, col))) {
            break
        }
        validMoves++
        board[row][col] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    // Up-Left
    row = r_q
    col = c_q
    while (row >= 1 && col >= 1) {
        row--
        col--
        if (obstaclesSet.contains(Pair(row, col))) {
            break
        }
        validMoves++
        board[row][col] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    // Up-Right
    row = r_q
    col = c_q
    while (row >= 1 && col < n - 1) {
        row--
        col++
        if (obstaclesSet.contains(Pair(row, col))) {
            break
        }
        validMoves++
        board[row][col] = if (validMoves < 10) " ${validMoves.toString()}" else validMoves.toString()
    }

    // Print the board for debugging
    for (j in 1..<n) {
        print("-----")
    }
    print("--")
    println()
    print("   | ")
    for (j in 1..n) {
        print(" $j | ")
    }
    println()

    for (j in 1..<n) {
        print("-----")
    }
    print("--")
    println()

    for (i in 0..<n) {
        print("${n - i}: | ")
        for (j in 0..<n) {
            print(board[i][j] + " | ")
        }
        println()
        for (j in 1..<n) {
            print("-----")
        }
        print("--")
        println()
    }
    return validMoves
}

fun main(args: Array<String>) {
    val n = 5
    val k = 3
    val r_q = 4
    val c_q = 3

    val obstacles = arrayOf(
        arrayOf(5, 5),
        arrayOf(4, 2),
        arrayOf(2, 3)
    )

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    println(result)
}
