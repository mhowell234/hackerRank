/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here

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
//    val n = 5
//    val s = arrayOf(1, 2, 1, 3, 2)
//
//    val d = 3
//
//    val m = 2
//
//    val n = 1
//    val s = arrayOf(4)
//
//    val d = 4
//
//    val m = 1
//
    val s = arrayOf(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1)

    val d = 18

    val m = 7

    val result = birthday(s, d, m)

    println(result)
}
