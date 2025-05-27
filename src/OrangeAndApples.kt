/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    // Write your code here
    val home_left = s
    val home_right = t
    val apple_tree = a
    val orange_tree = b
    var apple_hits = 0
    var orange_hits = 0

    apples.forEach {
        val point = it + apple_tree
        if (point >= home_left && point <= home_right) {
            apple_hits = apple_hits + 1
        }
    }

    oranges.forEach {
        val point = it + orange_tree
        if (point >= home_left && point <= home_right) {
            orange_hits = orange_hits + 1
        }
    }

    println(apple_hits)
    println(orange_hits)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    third_multiple_input[0].toInt()

    third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
