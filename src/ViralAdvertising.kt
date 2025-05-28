fun viralAdvertising(n: Int): Int {
    var shared = 5
    var totalLiked = 2

    if (n == 1) {
        return totalLiked
    }

    var liked = totalLiked
    for (i in 2..n) {
        shared = liked * 3
        liked = shared / 2
        totalLiked += liked
    }
    return totalLiked
}

fun main(args: Array<String>) {
    val n = 3

    val result = viralAdvertising(n)

    println(result)
}
