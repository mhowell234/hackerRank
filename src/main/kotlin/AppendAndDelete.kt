fun appendAndDelete(s: String, t: String, k: Int): String {
    val commonLength = getCommonPrefixLength(s, t)
    val appends = s.length - commonLength
    val deletes = t.length - commonLength
    val totalOps = appends + deletes

    if (totalOps <= k && (k - totalOps) % 2 == 0) {
        return "Yes"
    }

    if (k > s.length + t.length) {
        return "Yes"
    }

    return "No"
}

fun getCommonPrefixLength(s: String, t: String): Int {
    var i = 0
    while (i < s.length && i < t.length && s[i] == t[i]) {
        i++
    }
    return i
}

fun main(args: Array<String>) {
    val s = "hackerhappy"
    val t = "hackerrank"
    val k = 9
    val result = appendAndDelete(s, t, k)

    println(result)
}
