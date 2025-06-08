import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfWaysTest {
    @Test
    fun `returns correct count for typical input`() {
        val arr = arrayOf(1, 5, 3, 3, 3)
        assertEquals(4, numberOfWays(arr, 6))
    }

    @Test
    fun `returns zero when no pairs sum to k`() {
        val arr = arrayOf(1, 2, 3)
        assertEquals(0, numberOfWays(arr, 10))
    }

    @Test
    fun `returns zero for empty array`() {
        val arr = arrayOf<Int>()
        assertEquals(0, numberOfWays(arr, 5))
    }

    @Test
    fun `returns zero for single element`() {
        val arr = arrayOf(5)
        assertEquals(0, numberOfWays(arr, 5))
    }

    @Test
    fun `returns correct for negative numbers`() {
        val arr = arrayOf(-1, 7, 2, 8, -2)
        assertEquals(2, numberOfWays(arr, 6))
    }
}

