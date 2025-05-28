import java.text.SimpleDateFormat
import java.util.*

fun timeConversion(s: String): String {
    val inputDate = SimpleDateFormat("hh:mm:ssa", Locale.US)
    val outputDate = SimpleDateFormat("HH:mm:ss", Locale.US)
    return outputDate.format(inputDate.parse(s))
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
