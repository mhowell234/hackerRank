import kotlin.math.abs

fun beautifulDays(i: Int, j: Int, k: Int): Int {
  var days = 0

  for (v in i..j) {
      val calculation = abs(v - v.reverse())

      if (calculation % k == 0) {
          days += 1
      }
  }
  return days
}

fun Int.reverse(): Int {
    var n = this
    var reversed: Long = 0

    while (n > 0) {
        reversed = (10 * reversed) + (n % 10)
        require(reversed <= Int.MAX_VALUE) { "Cannot reverse ${this}! Cause: Int overflow" }
        n /= 10
    }

    return reversed.toInt()
}

fun main(args: Array<String>) {
    val i = 13
    val j = 45
    val k = 3
    val result = beautifulDays(i, j, k)
    println(result)
}
