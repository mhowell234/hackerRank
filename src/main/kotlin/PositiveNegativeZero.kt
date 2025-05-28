fun plusMinus(arr: Array<Int>) {
    val valueType = mutableListOf<Int>(0, 0, 0)
    arr.forEach {
        if (it > 0) {
            valueType[0] = valueType[0] + 1
        } else if (it < 0) {
            valueType[1] = valueType[1] + 1
        } else {
            valueType[2] = valueType[2] + 1
        }
    }
    val total = arr.size
    val postive_percentage = valueType[0].toFloat() / total.toFloat()
    val negative_percentage = valueType[1].toFloat() / total.toFloat()
    val zero_percentage = valueType[2].toFloat() / total.toFloat()

    println(String.format("%.6f", postive_percentage))
    println(String.format("%.6f", negative_percentage))
    println(String.format("%.6f", zero_percentage))
}

fun main(args: Array<String>) {
    readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
