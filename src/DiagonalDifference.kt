import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var i = 0
    var primary = 0
    while (i <= arr.size - 1) {
        primary = primary + arr[i][i]
        i = i + 1
    }
    var j = arr.size - 1
    i = 0
    var secondary = 0
    while (j >= 0) {
        secondary = secondary + arr[i][j]
        i = i + 1
        j = j - 1
    }

    return abs(primary - secondary)
    // Write your code here

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
