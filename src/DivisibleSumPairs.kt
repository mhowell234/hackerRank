/*
 * Complete the 'divisibleSumPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY ar
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    // Write your code here
    mutableListOf<Pair<Int, Int>>()

    var matches = 0

    ar.forEachIndexed { i, it ->
        var j = i + 1
        while (j < ar.size) {
            val right = ar[j]
            if ((it + right) % k == 0) {
                matches += 1
            }
            j = j + 1
        }
    }
    return matches
}

fun main(args: Array<String>) {
    val n = 6
    val k = 3
    val ar = arrayOf(1, 3, 2, 6, 1, 2)
    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
