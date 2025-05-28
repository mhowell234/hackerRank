fun pickingNumbers(a: Array<Int>): Int {
    val minValue = a.min()
    val maxValue = a.max()

    if (maxValue == minValue) {
        return a.size
    }

    var maxCount = 0
    for (i in minValue..maxValue) {
        val currentCount = a.filter { it == i }.size
        val nextCount = a.filter { it == i + 1 }.size
        if (currentCount + nextCount > maxCount) {
            maxCount = currentCount + nextCount
        }
    }
    return maxCount
}

fun main(args: Array<String>) {
    val a = arrayOf(4, 6, 5, 3, 3, 1)
    val result = pickingNumbers(a)

    println(result)
}
