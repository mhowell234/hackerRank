fun main(args : Array<String>) {
    val arr = arrayOf(1, 2)
    println(passingYearbooks(arr.toIntArray()).joinToString(", "))
}

fun passingYearbooks(arr: IntArray): IntArray {
    val n = arr.size
    val result = IntArray(n) { 0 }
    val yearbooks = IntArray(n) { 0 }

    for (i in 0 until n) {
        var current = i
        var count = 0
        while (yearbooks[current] != i + 1) {
            yearbooks[current] = i + 1
            current = arr[current] - 1
            count++
        }
        result[i] = count
    }

    return result
}