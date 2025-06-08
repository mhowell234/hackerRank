import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PassingYearbooksTest {
    @Test
    fun `returns correct for simple case`() {
        val arr = intArrayOf(1, 2)
        assertArrayEquals(intArrayOf(1, 1), passingYearbooks(arr))
    }

    @Test
    fun `returns correct for single cycle`() {
        val arr = intArrayOf(2, 3, 4, 5, 1)
        assertArrayEquals(intArrayOf(5, 5, 5, 5, 5), passingYearbooks(arr))
    }

    @Test
    fun `returns correct for multiple cycles`() {
        val arr = intArrayOf(2, 1, 4, 3)
        assertArrayEquals(intArrayOf(2, 2, 2, 2), passingYearbooks(arr))
    }

    @Test
    fun `returns correct for self loop`() {
        val arr = intArrayOf(1)
        assertArrayEquals(intArrayOf(1), passingYearbooks(arr))
    }

    @Test
    fun `returns correct for mixed cycles`() {
        val arr = intArrayOf(2, 1, 4, 5, 3)
        assertArrayEquals(intArrayOf(2, 2, 3, 3, 3), passingYearbooks(arr))
    }
}

