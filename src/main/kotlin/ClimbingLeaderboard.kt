fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
    val ranked_without_dups = ranked.distinct().reversed()
    return player.map { findRank(it, ranked_without_dups) }.toTypedArray()
}

fun findRank(score: Int, totalScores: List<Int>): Int {
    var low = 0
    var high = totalScores.size - 1

    if (totalScores[low] > score) {
        return totalScores.size + 1
    }
    if (totalScores[high] == score) {
        return 1
    }

    while (low <= high) {
        var middle = (high + low).floorDiv(2)

        if (score == totalScores[middle]) {
            return totalScores.size - middle
        } else if (score < totalScores[middle]) {
            high = middle - 1
        } else if (score > totalScores[middle]) {
            low = middle + 1
        }
    }
    return totalScores.size - low + 1
}

fun main(args: Array<String>) {
    val ranked = arrayOf(100, 90, 90, 80, 75, 60)
    val player = arrayOf(50, 65, 77, 90, 102)
    val result = climbingLeaderboard(ranked, player)

    println(result.joinToString("\n"))
    assert(result.equals(arrayOf(6, 5, 4, 2, 1)))
}
