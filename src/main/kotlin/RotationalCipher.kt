
fun rotationalCipher(input: String, rotationFactor: Int): String {
    val builder = StringBuilder()

    for (char in input) {
        when {
            char.isDigit() -> {
                val newChar = ((char - '0' + rotationFactor) % 10 + '0'.code).toChar()
                builder.append(newChar)
            }
            char.isLowerCase() -> {
                val newChar = ((char - 'a' + rotationFactor) % 26 + 'a'.code).toChar()
                builder.append(newChar)
            }
            char.isUpperCase() -> {
                val newChar = ((char - 'A' + rotationFactor) % 26 + 'A'.code).toChar()
                builder.append(newChar)
            }
            else -> {
                builder.append(char)
            }
        }
    }

    return builder.toString()
}

fun main(args : Array<String>) {
    val input = "abcdefghijklmNOPQRSTUVWXYZ0123456789"
    val rotationFactor = 39
    val output = rotationalCipher(input, rotationFactor)
    val expectedOutput = "nopqrstuvwxyzABCDEFGHIJKLM9012345678"
    println("Output: $output")
    assert(output == expectedOutput) { "Expected: $expectedOutput, but got: $output" }
}
