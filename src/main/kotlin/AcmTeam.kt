fun acmTeam(topic: Array<String>): Array<Int> {
    if (topic.isEmpty() || topic.size == 1) {
        return arrayOf(0, 0)
    }

    var permutations = mutableMapOf<Pair<Int, Int>, Int>()

    for (i in topic.indices) {
        for (j in i + 1 until topic.size) {
            val key = Pair(i, j)
            if (!permutations.containsKey(key)) {
                var count = 0
                for (k in topic[i].indices) {
                    if (topic[i][k] == '1' || topic[j][k] == '1') {
                        count++
                    }
                }
                permutations[key] = count
            }
        }
    }

    val maxTopics = permutations.values.max()
    val totalTeams = permutations.values.count { it == maxTopics }
    return arrayOf(maxTopics, totalTeams)
}

fun main(args: Array<String>) {
    val n = 4
    val m = 5

    val topic = arrayOf("10101", "11100", "11010", "00101")

    val result = acmTeam(topic)

    println(result.joinToString("\n"))
}
