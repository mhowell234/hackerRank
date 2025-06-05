import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SherlockAndSquaresTest {
    @Test
    fun `returns correct count for range with squares`() {
        assertEquals(2, squares(3, 9)) // 4 and 9
    }

    @Test
    fun `returns zero when no squares in range`() {
        assertEquals(0, squares(17, 24))
    }

    @Test
    fun `returns one when range is single square`() {
        assertEquals(1, squares(16, 16)) // 16
    }

    @Test
    fun `returns correct for large range`() {
        assertEquals(3, squares(1, 9)) // 1, 4, 9
    }

    @Test
    fun `returns zero when range is invalid`() {
        assertEquals(0, squares(10, 3))
    }
}

