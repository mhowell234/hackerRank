fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    val remainders = IntArray(k)
    for (num in s) {
        remainders[num % k]++
    }

    var count = minOf(remainders[0], 1) // Only one element with remainder 0 can be included
    if (k % 2 == 0) {
        count += minOf(remainders[k / 2], 1) // Only one element with remainder k/2 can be included
    }

    for (i in 1..(k / 2)) {
        if (i != k - i) {
            count += maxOf(remainders[i], remainders[k - i])
        }
    }

    return count
}

fun main(args: Array<String>) {
    val n = 4
    val k = 3

    val s = arrayOf(1, 7, 2, 4)

    val result = nonDivisibleSubset(k, s)

    println(result)
}
