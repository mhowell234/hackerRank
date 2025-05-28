fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    return (((s - 1) + ((m - 1) % n)) % n) + 1
}

fun main(args: Array<String>) {
    arrayOf(arrayOf(5, 2, 1), arrayOf(5, 2, 2)).forEach {
        val result = saveThePrisoner(it[0], it[1], it[2])
        println(result)
    }
}
