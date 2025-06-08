fun determineDnaHealth(genes: Array<String>, health: Array<Int>, queries: Array<Triple<Int, Int, String>>): String {
    val ahoCorasick = AhoCorasick(genes.toList())

    var minHealth = Long.MAX_VALUE
    var maxHealth = Long.MIN_VALUE

    for (query in queries) {
        val (start, end, dna) = query
        val queryHealth = calculateHealth(ahoCorasick, dna, health, start, end)

        if (queryHealth > maxHealth) {
            maxHealth = queryHealth
        }
        if (queryHealth < minHealth) {
            minHealth = queryHealth
        }
    }

    println("${minHealth} ${maxHealth}")
    return "${minHealth} ${maxHealth}"
}

fun calculateHealth(ahoCorasick: AhoCorasick, dna: String, health: Array<Int>, start: Int, end: Int): Long {
    var totalHealth = 0L
    if (dna.isEmpty()) return totalHealth

    val matches = ahoCorasick.search(dna)
    val healthyMatches = matches.filterIndexed { index, _ -> index in start..end }
    val healthValues = health.filterIndexed { index, _ -> index in start..end }

    for (i in healthyMatches.indices) {
        val it = healthyMatches[i]
        if (it.isNotEmpty()) {
            it.forEach { totalHealth += healthValues[i].toLong() }
        }
    }

    return totalHealth
}

fun main(args: Array<String>) {
    val n = 6
    val genes = arrayOf("a", "b", "c", "aa", "d", "b")
    val health = arrayOf(1, 2, 3, 4, 5, 6)
    val s = 3
    val queries = arrayOf(
        Triple(1, 5, "caaab"),
        Triple(0, 4, "xyz"),
        Triple(2, 4, "bcdybc")
    )
    determineDnaHealth(genes, health, queries)
}
