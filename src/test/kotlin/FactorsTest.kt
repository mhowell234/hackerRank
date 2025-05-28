import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FactorsTest {
    @Test
    fun `returns correct count for typical input`() {
        val a = arrayOf(2, 4)
        val b = arrayOf(16, 32, 96)
        assertEquals(3, getTotalX(a, b))
    }

    @Test
    fun `returns zero when no common factors`() {
        val a = arrayOf(3, 5)
        val b = arrayOf(7, 11)
        assertEquals(0, getTotalX(a, b))
    }

    @Test
    fun `returns one when only one possible`() {
        val a = arrayOf(1)
        val b = arrayOf(1)
        assertEquals(1, getTotalX(a, b))
    }
}
