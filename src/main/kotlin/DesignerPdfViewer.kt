val letters = mutableMapOf<Char, Int>()

fun designerPdfViewer(h: Array<Int>, word: String): Int {

    var index = 0
    for (char in 'a'..'z') {
        letters.put(char, index)
        index += 1
    }

    var max = -1
    for (i in word) {
        val letterSize = h[letters[i]!!]
        if (letterSize > max) {
            max = letterSize
        }
    }
    var wordLength = word.length
    return max * wordLength
}

fun main(args: Array<String>) {
    val h = arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7)
    val word = "zaba"
    val result = designerPdfViewer(h, word)
    println(result)
}
