fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val n = a.size
    val rotations = k % n

    val rotatedArray = Array(n) { 0 }
    for (i in 0 until n) {
        val newIndex = (i + rotations) % n
        rotatedArray[newIndex] = a[i]
    }

    return queries.map { rotatedArray[it] }.toTypedArray()
}

fun main(args: Array<String>) {
    val k = 2
    val a = arrayOf(1, 2, 3)
    val queries = arrayOf(0, 1, 2)
    val result = circularArrayRotation(a, k, queries)

    println(result.joinToString("\n"))
}