import kotlin.math.max
import kotlin.math.min

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var squares = arrayOf(
        arrayOf(arrayOf(8, 1, 6), arrayOf(3, 5, 7), arrayOf(4, 9, 2)),
        arrayOf(arrayOf(6, 1, 8), arrayOf(7, 5, 3), arrayOf(2, 9, 4)),
        arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 6)),
        arrayOf(arrayOf(2, 9, 4), arrayOf(7, 5, 3), arrayOf(6, 1, 8)),
        arrayOf(arrayOf(8, 3, 4), arrayOf(1, 5, 9), arrayOf(6, 7, 2)),
        arrayOf(arrayOf(4, 3, 8), arrayOf(9, 5, 1), arrayOf(2, 7, 6)),
        arrayOf(arrayOf(6, 7, 2), arrayOf(1, 5, 9), arrayOf(8, 3, 4)),
        arrayOf(arrayOf(2, 7, 6), arrayOf(9, 5, 1), arrayOf(4, 3, 8))
    )

    val diffs = mutableListOf<Int>()
    squares.forEach {
        var totalDiff = 0
        it.zip(s).forEach { (squareRow, inputRow) ->
            squareRow.zip(inputRow).forEach { (squareItem, inputItem) ->
                println("${squareItem} -> ${inputItem}")
                totalDiff += max(squareItem, inputItem) - min(squareItem, inputItem)
            }
        }
        diffs.add(totalDiff)
    }
    return diffs.min()
}

fun main(args: Array<String>) {
    val s = arrayOf(arrayOf(4, 8, 2), arrayOf(4, 5, 7), arrayOf(6, 1, 6))
    val result = formingMagicSquare(s)
    println(result)
}
