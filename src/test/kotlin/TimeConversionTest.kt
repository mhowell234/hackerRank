import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TimeConversionTest {
    @Test
    fun `returns correct 24 hour format for AM`() {
        assertEquals("00:01:00", timeConversion("12:01:00AM"))
    }

    @Test
    fun `returns correct 24 hour format for PM`() {
        assertEquals("19:05:45", timeConversion("07:05:45PM"))
    }

    @Test
    fun `returns correct 24 hour format for noon`() {
        assertEquals("12:00:00", timeConversion("12:00:00PM"))
    }

    @Test
    fun `returns correct 24 hour format for midnight`() {
        assertEquals("00:00:00", timeConversion("12:00:00AM"))
    }

    @Test
    fun `returns correct for single digit hour`() {
        assertEquals("09:15:30", timeConversion("09:15:30AM"))
    }
}
