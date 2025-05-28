import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BirthdaysTest {
    @Test
    fun `returns correct count for typical input`() {
        val s = arrayOf(2, 2, 1, 3, 2)
        assertEquals(2, birthday(s, 4, 2))
    }

    @Test
    fun `returns one for single element matching`() {
        val s = arrayOf(4)
        assertEquals(1, birthday(s, 4, 1))
    }

    @Test
    fun `returns zero for single element not matching`() {
        val s = arrayOf(1)
        assertEquals(0, birthday(s, 4, 1))
    }

    @Test
    fun `returns zero when no possible segments`() {
        val s = arrayOf(1, 2, 3)
        assertEquals(0, birthday(s, 10, 2))
    }
}

