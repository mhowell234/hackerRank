fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
    val costBlack = b * bc.toLong()
    val costWhite = w * wc.toLong()

    val convertBlackToWhite = w * (bc + z).toLong()
    val convertWhiteToBlack = b * (wc + z).toLong()

    return minOf(
        costBlack + costWhite,
        costBlack + convertBlackToWhite,
        costWhite + convertWhiteToBlack
    )
}

fun main(args: Array<String>) {

    val t = 5
    arrayOf(
        arrayOf(10, 10, 1, 1, 1),
        arrayOf(5, 9, 2, 3, 4),
        arrayOf(3, 6, 9, 1, 1),
        arrayOf(7, 7, 4, 2, 1),
        arrayOf(3, 3, 1, 9, 2)
    ).forEach {
        val result = taumBday(it[0], it[1], it[2], it[3], it[4])
        println(result)
    }
}
