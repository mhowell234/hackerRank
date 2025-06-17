fun larrysArray(A: IntArray): Boolean {
    val n = A.size
    if (n < 3) return true

    var inversions = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (A[i] > A[j]) {
                println("Comparing A[$i] = ${A[i]} and A[$j] = ${A[j]}")
                inversions++
            }
            else {
                println("Comparing A[$i] = ${A[i]} and A[$j] = ${A[j]} - No inversion")
            }
        }
    }

    return inversions % 2 == 0
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val result = larrysArray(array)
    println(result)
}