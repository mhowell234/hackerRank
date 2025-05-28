import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DivisibleSumPairsTest {
    @Test
    fun `returns correct count for typical input`() {
        assertEquals(5, divisibleSumPairs(6, 3, arrayOf(1, 3, 2, 6, 1, 2)))
    }

    @Test
    fun `returns correct for all pairs divisible`() {
        assertEquals(3, divisibleSumPairs(3, 1, arrayOf(1, 2, 3)))
    }

    @Test
    fun `returns zero for single element`() {
        assertEquals(0, divisibleSumPairs(1, 2, arrayOf(1)))
    }
}

