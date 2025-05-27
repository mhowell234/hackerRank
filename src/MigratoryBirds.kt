/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    val frequencyMap = arr.groupingBy { it }.eachCount()

    val values = getKeysForMaxValue(frequencyMap)
    return values.min()
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
