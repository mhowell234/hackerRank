fun jumpingOnClouds(c: Array<Int>): Int {
    var jumps = 0
    var index = 0

    while (index < c.size - 1) {
        if (index + 2 < c.size && canVisit(c[index + 2])) {
            index += 2
        } else {
            index += 1
        }
        jumps++
    }

    return jumps
}

fun canVisit(cloudValue: Int) = cloudValue == 0

fun main(args: Array<String>) {
    val n = 7
    val c = arrayOf(0, 0, 1, 0, 0, 1, 0)

    val result = jumpingOnClouds(c)

    println(result)
}
