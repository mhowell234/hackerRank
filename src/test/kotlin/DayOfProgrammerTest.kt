import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayOfProgrammerTest {
    @Test
    fun `returns correct date for leap year julian`() {
        assertEquals("12.09.1704", dayOfProgrammer(1704))
    }

    @Test
    fun `returns correct date for non-leap year julian`() {
        assertEquals("13.09.1701", dayOfProgrammer(1701))
    }

    @Test
    fun `returns correct date for leap year gregorian`() {
        assertEquals("12.09.2016", dayOfProgrammer(2016))
    }

    @Test
    fun `returns correct date for non-leap year gregorian`() {
        assertEquals("13.09.2017", dayOfProgrammer(2017))
    }

    @Test
    fun `returns correct date for transition year`() {
        assertEquals("26.09.1918", dayOfProgrammer(1918))
    }
}

