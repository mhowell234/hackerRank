fun organizingContainers(container: Array<Array<Int>>): String {
    val n = container.size
    val typeCount = IntArray(n)
    val containerCount = IntArray(n)

    for (i in 0 until n) {
        for (j in 0 until n) {
            typeCount[j] += container[i][j]
            containerCount[i] += container[i][j]
        }
    }

    typeCount.sort()
    containerCount.sort()

    return if (typeCount.contentEquals(containerCount)) "Possible" else "Impossible"
}

fun main(args: Array<String>) {
    val q = 2
    val matrixOne =
        arrayOf(
            arrayOf(1, 1),
            arrayOf(1, 1),
        )
    val matrixTwo =
        arrayOf(
            arrayOf(0, 2),
            arrayOf(1, 1),
        )


    val result = organizingContainers(matrixOne)
    println(result)
    val resultTwo = organizingContainers(matrixTwo)
    println(resultTwo)

}
