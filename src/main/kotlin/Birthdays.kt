fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    val chunks: MutableList<MutableList<Int>> = mutableListOf()
    if (s.size == 1 && m == 1) {
        if (s[0] == d) {
            return 1
        }
    } else {
        (0 until s.size - 1).forEach {
            val aChunk = mutableListOf<Int>()
            (0 until m).forEach { it2 ->
                if (it + it2 < s.size) {
                    aChunk.add(s[it + it2])
                }
            }
            if (aChunk.size == m) {
                chunks.add(aChunk)
            }
        }
    }

    var sections = 0
    chunks.forEach { it ->
        if (d == it.sum()) {
            sections += 1
        }
    }

    return sections
}

fun main(args: Array<String>) {
    val s = arrayOf(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1)
    val d = 18
    val m = 7
    val result = birthday(s, d, m)

    println(result)
}
