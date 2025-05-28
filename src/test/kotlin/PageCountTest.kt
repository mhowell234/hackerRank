import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PageCountTest {
    @Test
    fun `returns zero when on first page`() {
        assertEquals(0, pageCount(5, 1))
    }

    @Test
    fun `returns zero when on last page`() {
        assertEquals(0, pageCount(6, 6))
    }

    @Test
    fun `returns correct turns for middle page`() {
        assertEquals(0, pageCount(5, 4))
    }

    @Test
    fun `returns correct turns for even pages`() {
        assertEquals(1, pageCount(6, 5))
    }

    @Test
    fun `returns zero for single page book`() {
        assertEquals(0, pageCount(1, 1))
    }

    @Test
    fun `returns zero for page zero`() {
        assertEquals(0, pageCount(5, 0))
    }

    @Test
    fun `returns one for page two`() {
        assertEquals(1, pageCount(5, 2))
    }
}

