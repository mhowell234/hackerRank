/*
 * Complete the 'utopianTree' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun utopianTree(n: Int): Int {
    var cycle = 0
    var value = 1
    for (i in 0..<n) {
        if (cycle == 1) {
            cycle = 0
            value += 1
        } else {
            cycle = 1
            value *= 2
        }
    }
    return value
}

fun main(args: Array<String>) {
    val t = 3

    arrayOf(0, 1, 4).forEach {
        val result = utopianTree(it)
        println(result)
    }
}
