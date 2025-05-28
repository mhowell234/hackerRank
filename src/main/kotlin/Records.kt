fun breakingRecords(scores: Array<Int>): Array<Int> {
    val records = arrayOf<Int>(0, 0)

    var min = scores[0]
    var max = scores[0]

    for (i in 1..scores.size - 1) {
        if (scores[i] < min) {
            min = scores[i]
            records[1] = records[1] + 1
        }
        if (scores[i] > max) {
            max = scores[i]
            records[0] = records[0] + 1
        }
    }
    return records
}

fun main(args: Array<String>) {

    val scores = arrayOf<Int>(10, 5, 20, 20, 4, 5, 2, 25, 1)

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
