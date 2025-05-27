/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here

    val sock_count = ar.groupBy { it }

    var matchingSocks = 0

    sock_count.values.forEach { v ->
        val num = v.size
        matchingSocks += (num / 2).toInt()
    }

    return matchingSocks
}

fun main(args: Array<String>) {
    val n = 9

    val ar = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)

    val result = sockMerchant(n, ar)

    println(result)
}
