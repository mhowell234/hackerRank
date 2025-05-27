import kotlin.math.ceil
import kotlin.math.min

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int {
    var startPagesTurned = 0
    if (p == 0 || p == 1 || n == 0 || n == 1) {
        return startPagesTurned
    }
    if (p == 2) {
        return 1
    }
    val range = 2..n
    val pages = range.chunked(2)
    run breaking@{
        pages.forEach {
            if (!it.contains(p)) {
                startPagesTurned += 1
            } else if (it.contains(p)) {
                startPagesTurned += 1
                return@breaking
            }
        }
    }

    var endPagesTurned = ceil((n - p).toFloat() / 2)
    var varEndPagesTurned = 0
    var fromEndPages = pages.reversed()
    fromEndPages.forEach {
        if (!it.contains(p) && p < it.min()) {
            varEndPagesTurned += 1
        }
    }
    return min(varEndPagesTurned.toInt(), min(startPagesTurned.toFloat(), endPagesTurned).toInt())
}

fun main(args: Array<String>) {
    val n = 5
    val p = 4
//    val n = 37455
//    val p = 29835
    val result = pageCount(n, p)
    println(result)
}