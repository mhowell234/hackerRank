fun equalizeArray(arr: Array<Int>): Int {
    if (arr.size == 1) {
        return 0
    }

    val frequencyMap = arr.groupingBy { it }.eachCount()
    val maxFrequency = frequencyMap.maxBy { it.value }
    return arr.size - maxFrequency.value
}

fun main(args: Array<String>) {
    val n = 5

    val arr = arrayOf(3, 3, 2, 1, 3)

    val result = equalizeArray(arr)

    println(result)
}
