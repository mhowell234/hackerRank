fun angryProfessor(k: Int, a: Array<Int>): String {
    var arrivedBeforeOrOntime = a.filter { it <= 0 }.size

    if (arrivedBeforeOrOntime >= k) {
        return "NO"
    }

    return "YES"
}

fun main(args: Array<String>) {
    val t = 2

    var n = 4
    var k = 3
    var a = arrayOf(-1, -3, 4, 2)
    var result = angryProfessor(k, a)
    println(result)

    n = 4
    k = 2
    a = arrayOf(0, -1, 2, 1)
    result = angryProfessor(k, a)
    println(result)
}
