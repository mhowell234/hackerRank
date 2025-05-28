import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DiagonalDifferenceTest {
    @Test
    fun `returns correct difference for typical matrix`() {
        val arr = arrayOf(
            arrayOf(11, 2, 4),
            arrayOf(4, 5, 6),
            arrayOf(10, 8, -12)
        )
        assertEquals(15, diagonalDifference(arr))
    }

    @Test
    fun `returns zero for single element matrix`() {
        val arr = arrayOf(arrayOf(5))
        assertEquals(0, diagonalDifference(arr))
    }

    @Test
    fun `returns correct for negative numbers`() {
        val arr = arrayOf(
            arrayOf(-1, -2, -3),
            arrayOf(-4, -5, -6),
            arrayOf(-7, -8, -9)
        )
        assertEquals(0, diagonalDifference(arr))
    }
}

