fun squares(a: Int, b: Int): Int {
    val sqrtA = Math.ceil(Math.sqrt(a.toDouble())).toInt()
    val sqrtB = Math.floor(Math.sqrt(b.toDouble())).toInt()

    return if (sqrtB >= sqrtA) {
        (sqrtB - sqrtA + 1)
    } else {
        0
    }
}

fun main(args: Array<String>) {
    val q = 2

    val inputs = arrayOf(
        Pair(3, 9),
        Pair(17, 24)
    )

    inputs.forEach {
        val result = squares(it.first, it.second)
        println(result)
    }
}
