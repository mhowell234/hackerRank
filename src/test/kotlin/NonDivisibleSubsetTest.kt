import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NonDivisibleSubsetTest {
    @Test
    fun `returns correct subset size for typical input`() {
        assertEquals(3, nonDivisibleSubset(3, arrayOf(1, 7, 2, 4)))
    }

    @Test
    fun `returns one for all elements divisible`() {
        assertEquals(1, nonDivisibleSubset(2, arrayOf(2, 4, 6, 8)))
    }

    @Test
    fun `returns correct for large k`() {
        assertEquals(3, nonDivisibleSubset(7, arrayOf(14, 21, 28, 35, 1, 2)))
    }
}

