import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BeautifulDaysTest {
    @Test
    fun `returns correct count for typical range`() {
        assertEquals(2, beautifulDays(20, 23, 6))
    }

    @Test
    fun `returns all days beautiful when K is one`() {
        assertEquals(5, beautifulDays(10, 14, 1))
    }

    @Test
    fun `returns zero when no beautiful days`() {
        assertEquals(0, beautifulDays(21, 21, 2))
    }

    @Test
    fun `handles large range`() {
        assertTrue(beautifulDays(1, 1000, 7) > 0)
    }

    @Test
    fun `handles reverse of single digit`() {
        assertEquals(1, beautifulDays(7, 7, 1))
    }
}

