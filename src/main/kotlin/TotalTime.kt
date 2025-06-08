
fun getTotalTime(arr: Array<Int>): Int {
    val times = arr.toMutableList()
    var penalty = 0
    times.sort()
    while (times.size > 1) {
        val newMax = times.removeLast() + times.removeLast()
        penalty += newMax
        times.addLast(newMax)
    }
    return penalty
}

fun main(args : Array<String>) {
    val arr = arrayOf(4, 2, 1, 3)
    println(getTotalTime(arr))
}