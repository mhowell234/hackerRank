fun biggerIsGreater(w: String): String {
    val chars = w.toCharArray()
    val size = chars.size

    var k = size - 2
    while (k >= 0 && chars[k] >= chars[k + 1]) {
        k--
    }

    if (k == -1) {
        return "no answer"
    }

    var l = size - 1
    while (chars[l] <= chars[k]) {
        l--
    }

    var temp = chars[k]
    chars[k] = chars[l]
    chars[l] = temp

    var start = k + 1
    var end = size - 1
    while (start < end) {
        val temp2 = chars[start]
        chars[start] = chars[end]
        chars[end] = temp2
        start++
        end--
    }

    return String(chars)
}

fun main(args: Array<String>) {

    arrayOf(
        "lmno",
        "dcba",
        "dcbb",
        "abdc",
        "abcd",
        "fedcbabcd"
    ).forEach { println(biggerIsGreater(it)) }
}
