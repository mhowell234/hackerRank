fun repeatedString(s: String, n: Long): Long {
    val numberOfAsInInitialString = s.filter { it == 'a' }.count().toLong()
    val fullRepetitions = n / s.length
    val remainder = n % s.length
    val numberOfAsInRemainder = s.take(remainder.toInt()).count { it == 'a' }
    return (numberOfAsInInitialString * fullRepetitions) + numberOfAsInRemainder
}

fun main(args: Array<String>) {
    val s = "a"
    val n = "1000000000000".toLong()

    val result = repeatedString(s, n)

    println(result)
}
