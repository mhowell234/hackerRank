fun migratoryBirds(arr: Array<Int>): Int {
    val frequencyMap = arr.groupingBy { it }.eachCount()

    val values = getKeysForMaxValue(frequencyMap)
    return if (values.size > 0) {
        values.min()
    } else {
        0
    }
}

fun <K, V : Comparable<V>> getKeysForMaxValue(map: Map<K, V>): List<K> {
    if (map.isEmpty()) {
        return emptyList()
    }

    val maxValue = map.values.maxOrNull()!!
    return map.filterValues { it == maxValue }.keys.toList()
}

fun main(args: Array<String>) {
    val arr = arrayOf(1, 4, 4, 4, 5, 5, 5, 3)

    val result = migratoryBirds(arr)

    println(result)
}
