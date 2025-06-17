import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LarrysArrayTest {

    @Test
    fun `returns true for sorted array`() {
        val sortedArray = intArrayOf(1, 2, 3, 4, 5)
        assertTrue(larrysArray(sortedArray))
    }

    @Test
    fun `returns true for array with even inversions`() {
        val reversedArray = intArrayOf(5, 4, 3, 2, 1)
        assertTrue(larrysArray(reversedArray))
    }

    @Test
    fun `returns false for array with odd inversions`() {
        val oddInversionsArray = intArrayOf(2, 1, 3, 4)
        assertFalse(larrysArray(oddInversionsArray))
    }

    @Test
    fun `returns true for array size less than 3`() {
        val singleElement = intArrayOf(10)
        val twoElements = intArrayOf(2, 1)
        assertTrue(larrysArray(singleElement))
        assertTrue(larrysArray(twoElements))
    }
}