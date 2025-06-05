import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun String.removeWhitespace(): String {
    return this.replace("\\s+".toRegex(), "")
}

fun encryption(s: String): String {
    val cleanedString = s.removeWhitespace()
    val cleanedLength = cleanedString.length
    val rootLength = Math.sqrt(cleanedLength.toDouble())
    var numRows = Math.floor(rootLength).toInt()
    var numCols = Math.ceil(rootLength).toInt()

    if (numRows * numCols < cleanedLength) {
        numRows++
    }

    val charArray = Array(numRows) { Array(numCols) { ' ' } }

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            val index = i * numCols + j
            if (index < cleanedString.length) {
                charArray[i][j] = cleanedString[index]
            }
        }
    }

    val encryptedString = StringBuilder()
    for (j in 0 until numCols) {
        for (i in 0 until numRows) {
            if (charArray[i][j] != ' ') {
                encryptedString.append(charArray[i][j])
            }
        }
        if (j < numCols - 1) {
            encryptedString.append(" ")
        }
    }

    return encryptedString.toString().trim()
}

fun main(args: Array<String>) {
    val s = "if man was meant to stay on the ground god would have given us roots"

    val result = encryption(s)

    println(result)
}
