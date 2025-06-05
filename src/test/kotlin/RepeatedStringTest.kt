import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RepeatedStringTest {
    @Test
    fun `returns correct count for typical input`() {
        assertEquals(7, repeatedString("aba", 10))
    }

    @Test
    fun `returns correct for single a`() {
        assertEquals(1000000000000, repeatedString("a", 1000000000000))
    }

    @Test
    fun `returns zero when no a`() {
        assertEquals(0, repeatedString("bcd", 10))
    }
}

