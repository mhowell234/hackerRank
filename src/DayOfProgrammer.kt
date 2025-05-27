/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */
val programmerDay = 256
val julianCalendarStart = 1700
val julianCalendarEnd = 2017
val gregorianSwitchYear = 1918
val gregorianCalendarStart = 2019


fun dayOfProgrammer(year: Int): String {
    // Write your code here
    var daysPerMonth = determinDaysPerMonth(year)
    var days = daysPerMonth.sum()
    var daysLeft = programmerDay - days

    return "${daysLeft}.09.${year}"
}

fun determinDaysPerMonth(year: Int): List<Int> {
    var febDays = 28

    if (year == gregorianSwitchYear) {
        febDays = 15
    } else if (isLeapYear(year)) {
        febDays = 29
    }

    return listOf(
        31,
        febDays,
        31,
        30,
        31,
        30,
        31,
        31
    )
}

fun isLeapYear(year: Int): Boolean {
    if (julianCalendarStart <= year && year <= julianCalendarEnd) {
        return year % 4 == 0
    } else if (year >= gregorianCalendarStart) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
    }

    return false
}

fun main(args: Array<String>) {
    val year = 2016

    val result = dayOfProgrammer(year)

    println(result)
}
