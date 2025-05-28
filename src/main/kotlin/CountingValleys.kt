fun calculateDistanceFromSeaLevel(c: Char, distanceFromSeaLevel: Int): Int {
    if (c == 'U') {
        return distanceFromSeaLevel + 1
    } else {
        return distanceFromSeaLevel - 1
    }
}

fun countingValleys(steps: Int, path: String): Int {
    var lastChar = path[0]
    var count = 0
    var distanceFromSeaLevel = calculateDistanceFromSeaLevel(lastChar, 0)

    var wasBelow = distanceFromSeaLevel < 0

    for (char in path.subSequence(1, path.length)) {
        distanceFromSeaLevel = calculateDistanceFromSeaLevel(char, distanceFromSeaLevel)
        if (distanceFromSeaLevel < 0) {
            wasBelow = true
        }
        if (wasBelow && distanceFromSeaLevel == 0) {
            count += 1
            wasBelow = false
        }
        lastChar = char
    }

    return count
}

fun main(args: Array<String>) {
    val steps = 8

    val path = "UDDDUDUU"
    val result = countingValleys(steps, path)

    println(result)
}
