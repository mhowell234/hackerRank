fun findDigits(n: Int): Int {
    var digitsLeft = n
    var divisors = 0
    while (digitsLeft > 0) {
        val digit = digitsLeft % 10
        if (digit != 0 && n % digit == 0) {
            divisors++
        }
        digitsLeft /= 10
    }

    return divisors
}

fun main(args: Array<String>) {
    val t = 11

    arrayOf(
        "123456789",
        "114108089",
        "110110015",
        "121",
        "33",
        "44",
        "55",
        "66",
        "77",
        "88",
        "106108048"
    ).forEach { input ->
        val n = input.trim().toInt()
        val result = findDigits(n)
        println(result)
    }
}
