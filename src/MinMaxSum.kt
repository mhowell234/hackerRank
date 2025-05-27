/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>) {
    arr.sort()
    val longArr = arr.map { it.toLong() }.toLongArray()
    val lowestValues = longArr.copyOfRange(0, arr.size - 1)
    val highestValues = longArr.copyOfRange(1, arr.size)

    print(lowestValues.sum())
    print(' ')
    print(highestValues.sum())
    // Write your code here
}

fun main(args: Array<String>) {

    val arr = arrayOf(793810624, 895642170, 685903712, 623789054, 468592370)

    miniMaxSum(arr)
}


