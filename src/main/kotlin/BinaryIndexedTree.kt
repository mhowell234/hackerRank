class BinaryIndexedTree(private val capacity: Int) {

    private val tree = LongArray(capacity + 1)

    fun getSum(index: Int): Long {
        validateInput(index)
        var i = index
        var sum = 0L
        while (i >= 1) {
            sum += tree[i]
            i -= i and -i
        }

        return sum
    }

    fun addValue(index: Int, value: Long) {
        validateInput(index)
        var i = index
        while (i <= capacity) {
            tree[i] += value
            i += i and -i
        }
    }

    private fun validateInput(index: Int) {
        if (index < 1 || index > capacity) {
            throw IllegalArgumentException("Index must be within 1 and tree capacity inclusive. Actual index : $index")
        }
    }
}

fun main() {
    val n = 10
    val bit = BinaryIndexedTree(n)

    // Adding values to the BIT
    bit.addValue(1, 5)
    bit.addValue(2, 3)
    bit.addValue(3, 7)

    // Getting sum of first 3 indices
    println("Sum of first 3 indices: ${bit.getSum(3)}") // Output: 15

    // Getting sum of first 2 indices
    println("Sum of first 2 indices: ${bit.getSum(2)}") // Output: 8

    // Getting sum of first index
    println("Sum of first index: ${bit.getSum(1)}") // Output: 5
}