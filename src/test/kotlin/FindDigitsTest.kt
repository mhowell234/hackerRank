import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindDigitsTest {
    @Test
    fun `returns correct divisor countfor typical input`() {
        assertEquals(2, findDigits(12))
        assertEquals(3, findDigits(1012))
    }

    @Test
    fun `returns one for single digit`() {
        assertEquals(1, findDigits(7))
    }

    @Test
    fun `returns zero for zero`() {
        assertEquals(0, findDigits(0))
    }

    @Test
    fun `ignores zero digits`() {
        assertEquals(1, findDigits(10))
        assertEquals(2, findDigits(120))
    }

    @Test
    fun `returns correct for all same digits`() {
        assertEquals(3, findDigits(111))
    }
}

