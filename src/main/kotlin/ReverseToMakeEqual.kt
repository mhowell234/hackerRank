fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
    if (target.size != arr.size) {
        return false
    }

    val targetCounts = mutableMapOf<Int, Int>()
    val arrCounts = mutableMapOf<Int, Int>()

    for (num in target) {
        targetCounts[num] = targetCounts.getOrDefault(num, 0) + 1
    }

    for (num in arr) {
        arrCounts[num] = arrCounts.getOrDefault(num, 0) + 1
    }

    return targetCounts == arrCounts
}

fun main() {
    val target = intArrayOf(1, 2, 3, 4)
    val arr = intArrayOf(2, 4, 1, 5)

    println("Can be equal: ${canBeEqual(target, arr)}")
}