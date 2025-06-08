import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TotalTimeTest {
    @Test
    fun `returns correct penalty for typical input`() {
        val arr = arrayOf(4, 2, 1, 3)
        assertEquals(26, getTotalTime(arr.copyOf()))
    }

    @Test
    fun `returns zero for single element`() {
        val arr = arrayOf(5)
        assertEquals(0, getTotalTime(arr.copyOf()))
    }

    @Test
    fun `returns zero for empty array`() {
        val arr = arrayOf<Int>()
        assertEquals(0, getTotalTime(arr.copyOf()))
    }

    @Test
    fun `returns correct penalty for two elements`() {
        val arr = arrayOf(7, 3)
        assertEquals(10, getTotalTime(arr.copyOf()))
    }

    @Test
    fun `returns correct penalty for all same elements`() {
        val arr = arrayOf(2, 2, 2, 2)
        assertEquals(18, getTotalTime(arr.copyOf()))
    }
}

