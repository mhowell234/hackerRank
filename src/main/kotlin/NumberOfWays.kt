fun main(args: Array<String>) {
    val arr = arrayOf(1, 5, 3, 3, 3)
    val k = 6
    println(numberOfWays(arr, k))
}

fun numberOfWays(arr: Array<Int>, k: Int): Int {
    var ways = 0

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            val sum = arr[i] + arr[j]
            if (sum == k) {
                ways++
            }
        }
    }

    return ways
}