fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    return when {
        y1 < y2 -> 0
        y1 > y2 -> 10000
        m1 < m2 -> 0
        m1 > m2 -> (m1 - m2) * 500
        d1 <= d2 -> 0
        else -> (d1 - d2) * 15
    }
}

fun main(args: Array<String>) {

    val d1 = 9
    val m1 = 6
    val y1 = 2015
    val d2 = 6
    val m2 = 6
    val y2 = 2015

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    println(result)
}
