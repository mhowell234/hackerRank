import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MinMaxSumTest {
    @Test
    fun `prints correct sums for typical input`() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        val output = captureStdout { miniMaxSum(arr) }
        assertTrue(output.trim() == "10 14" || output.trim() == "10 14\n")
    }

    @Test
    fun `prints correct sums for identical numbers`() {
        val arr = arrayOf(7, 7, 7, 7, 7)
        val output = captureStdout { miniMaxSum(arr) }
        assertTrue(output.trim() == "28 28" || output.trim() == "28 28\n")
    }
}

