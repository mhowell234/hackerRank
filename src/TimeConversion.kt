import java.text.SimpleDateFormat
import java.util.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val inputDate = SimpleDateFormat("hh:mm:ssa", Locale.US)
    val outputDate = SimpleDateFormat("HH:mm:ss", Locale.US)
    return outputDate.format(inputDate.parse(s))
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
