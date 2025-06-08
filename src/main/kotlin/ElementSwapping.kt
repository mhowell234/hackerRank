fun main(args: Array<String>) {
    val k = 3
    val arr = arrayOf(8, 9, 11, 2, 1)

    val result = findMinArray(arr, k)
    println(result.joinToString(", "))
}

val MIN_PAIR = Pair(Int.MIN_VALUE, Int.MIN_VALUE)

fun findMinArray(arr: Array<Int>, k: Int): Array<Int> {
    if (arr.isEmpty() || k <= 0) return arr

    val indicesToCheck = Math.min(k + 1, arr.size)
    (0..k).forEach {
        var maxDiff = -1
        var diffPair = MIN_PAIR.copy()

        var i = it + 1
        while (i < indicesToCheck) {
            val diff = arr[it] - arr[i]
            if (diff > maxDiff) {
                maxDiff = diff
                diffPair = Pair(it, i)
            }
            i++
        }

        if (diffPair != MIN_PAIR) {
            arr.swap(diffPair.first, diffPair.second)
        }
    }

    return arr
}

fun <K> Array<K>.swap(first: Int, second: Int) {
    val temp = this[first]
    this[first] = this[second]
    this[second] = temp
}