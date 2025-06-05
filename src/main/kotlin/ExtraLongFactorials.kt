import java.math.BigInteger

fun extraLongFactorials(n: Int): Unit {

    var value = BigInteger.ONE

    for (i in 2..n) {
        value *= BigInteger.valueOf(i.toLong())
    }

    println(value.toString())
}

fun main(args: Array<String>) {
    val n = 25

    extraLongFactorials(n)
}
