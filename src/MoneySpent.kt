/*
 * Complete the getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    keyboards.sortDescending()
    drives.sortDescending()

    var max = -1
    keyboards.forEach {
        drives.forEach { it2 ->
            val value = it + it2
            if (value <= b && value > max) {
                max = value
            }
        }
    }
    return max
}

fun main(args: Array<String>) {
    val b = 10

    val keyboards = arrayOf(3, 1)
    val drives = arrayOf(5, 2, 8)

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}
