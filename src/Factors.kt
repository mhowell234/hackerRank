/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    val aFactors = mutableSetOf<Int>()
    val bFactors = mutableSetOf<Int>()

    val bEndNumber = b[0]
    for (i in a[0]..bEndNumber) {
        val matches = mutableSetOf<Boolean>()
        for (j in a) {
            if (i % j == 0) {
                matches.add(true)
            } else {
                matches.add(false)
            }
        }
        if (matches.size == 1 && matches.contains(true)) {
            aFactors.add(i)
        }
    }

    val aEndNumber = a.last()
    for (i in aEndNumber..bEndNumber) {
        val matches = mutableSetOf<Boolean>()
        for (j in b) {
            if (j % i == 0) {
                matches.add(true)
            } else {
                matches.add(false)
            }
        }
        if (matches.size == 1 && matches.contains(true)) {
            bFactors.add(i)
        }
    }

    return (aFactors intersect bFactors).size
}

fun main(args: Array<String>) {
    val arr = arrayOf<Int>(2, 4)
    val brr = arrayOf<Int>(16, 32, 96)

    val total = getTotalX(arr, brr)

    println(total)
}
