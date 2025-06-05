import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TaumBdayTest {
    @Test
    fun `returns correct cost for no conversion needed`() {
        assertEquals(20, taumBday(10, 10, 1, 1, 1))
    }

    @Test
    fun `returnsCorrectCostForConversion cheaper`() {
        assertEquals(37, taumBday(5, 9, 2, 3, 4))
    }

    @Test
    fun `returns correct cost for large numbers`() {
        assertEquals(12, taumBday(3, 6, 9, 1, 1))
    }
}

