import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountingValleysTest {
    @Test
    fun `returns correct valley count for typical path`() {
        assertEquals(1, countingValleys(8, "UDDDUDUU"))
    }

    @Test
    fun `returns zero for no valleys`() {
        assertEquals(0, countingValleys(4, "UUUU"))
    }

    @Test
    fun `returns correct for multiple valleys`() {
        assertEquals(2, countingValleys(12, "DDUUDDUDUUUD"))
    }
}
