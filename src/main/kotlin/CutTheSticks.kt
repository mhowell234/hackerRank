fun cutTheSticks(arr: Array<Int>): Array<Int> {
    val results = mutableListOf<Int>()

    while (arr.filter { it > 0 }.size > 0) {
        val minStick = arr.filter { it > 0 }.min()
        results.add(arr.filter { it > 0 }.size)

        arr.forEachIndexed { index, i ->
            if (i > 0) {
                arr[index] = i - minStick!!
            }
        }
    }
    return results.toTypedArray()
}

fun main(args: Array<String>) {
    val n = 6

    val arr = arrayOf(5, 4, 4, 2, 2, 8)

    val result = cutTheSticks(arr)

    println(result.joinToString("\n"))
}
