/*
 * Complete the 'hurdleRace' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY height
 */

fun hurdleRace(k: Int, height: Array<Int>): Int {
    val max = height.max()

    return if (max - k < 0) {
        0
    } else {
        max - k
    }
}

fun main(args: Array<String>) {
    val n = 5
    val k = 4

    val height = arrayOf(1, 6, 3, 5, 2)

    val result = hurdleRace(k, height)

    println(result)
}
