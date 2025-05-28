import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UtopianTreeTest {
    @Test
    fun `returns one for zero cycles`() {
        assertEquals(1, utopianTree(0))
    }

    @Test
    fun `returns two for one cycle`() {
        assertEquals(2, utopianTree(1))
    }

    @Test
    fun `returns seven for four cycles`() {
        assertEquals(7, utopianTree(4))
    }

    @Test
    fun `returns correct height for large cycles`() {
        assertEquals(15, utopianTree(6))
    }
}
