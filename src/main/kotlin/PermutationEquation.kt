fun permutationEquation(p: Array<Int>): Array<Int> {
    val valueToIndex = p.mapIndexed { index, value -> Pair(value, index + 1) }.toMap()

    val equationResults = Array(p.size) {0}

    for (i in 1..p.size) {
        val initialLocation = valueToIndex[i]
        val nestedLocation = valueToIndex[initialLocation]!!
        equationResults[i - 1] = nestedLocation
    }
    return equationResults
}

fun main(args: Array<String>) {
    val n = 3
    val p = arrayOf(4, 3, 5, 1, 2)
    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}
