fun kaprekarNumbers(p: Int, q: Int) {
    val kaprekarNumbers = mutableListOf<String>()

    (p..q).forEach {
        val square = it.toLong() * it.toLong()
        val strSquare = square.toString()
        val len = strSquare.length

        val leftPart = if (len > 1) strSquare.substring(0, len / 2) else "0"
        val rightPart = strSquare.substring(len / 2)

        val left = leftPart.toInt()
        val right = rightPart.toInt()

        if (left + right == it) {
            kaprekarNumbers.add(it.toString())
        }
    }

    if (p > q || p < 1 || q > 100000 || kaprekarNumbers.isEmpty()) {
        print("INVALID RANGE")
    } else {
        println(kaprekarNumbers.joinToString(" "))
    }
}

fun main(args: Array<String>) {
    val p = 1
    val q = 99999

    kaprekarNumbers(p, q)
}
