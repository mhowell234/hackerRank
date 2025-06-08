import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ElementSwappingTest {
    @Test
    fun `returns min array for typical input`() {
        val arr = arrayOf(8, 9, 11, 2, 1)
        val result = findMinArray(arr.copyOf(), 3)
        assertArrayEquals(arrayOf(2, 8, 9, 11, 1), result)
    }

    @Test
    fun `returns original array when k is zero`() {
        val arr = arrayOf(5, 4, 3)
        val result = findMinArray(arr.copyOf(), 0)
        assertArrayEquals(arrayOf(5, 4, 3), result)
    }

    @Test
    fun `returns original array when empty`() {
        val arr = arrayOf<Int>()
        val result = findMinArray(arr.copyOf(), 2)
        assertArrayEquals(arrayOf<Int>(), result)
    }

    @Test
    fun `returns min array when k is large`() {
        val arr = arrayOf(3, 2, 1)
        val result = findMinArray(arr.copyOf(), 5)
        assertArrayEquals(arrayOf(1, 2, 3), result)
    }
}

