fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    val k1Velo = v1
    val k2Velo = v2

    var k1Loc = 0
    var k2Loc = 0
    var k1 = x1
    var k2 = x2
    var iterations = 0
    while (iterations <= 10000) {
        k1 = k1 + k1Velo
        k2 = k2 + k2Velo

        if (k1 == k2) {
            return "YES"
        }
        k1Loc = k1Loc + k1Velo
        k2Loc = k2Loc + k2Velo
        iterations = iterations + 1
    }
    return "NO"

}

fun main(args: Array<String>) {
    val result = kangaroo(4602, 8519, 7585, 8362)
    println(result)
}
