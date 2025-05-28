import kotlin.math.abs

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val xDistance = abs(x - z)
    val yDistance = abs(y - z)

    if (xDistance < yDistance) {
        return "Cat A"
    } else if (yDistance < xDistance) {
        return "Cat B"
    } else {
        return "Mouse C"
    }
}

fun main(args: Array<String>) {
    val qItr = listOf(listOf(1, 2, 3), listOf(1, 3, 2))

    qItr.forEach {

        val x = it[0]
        val y = it[1]
        val z = it[2]

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
