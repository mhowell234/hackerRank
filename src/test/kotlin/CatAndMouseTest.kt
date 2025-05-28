import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CatAndMouseTest {
    @Test
    fun `returns cat a when cat a is closer`() {
        assertEquals("Cat A", catAndMouse(1, 4, 2))
    }

    @Test
    fun `returns cat b when cat b is closer`() {
        assertEquals("Cat B", catAndMouse(4, 1, 2))
    }

    @Test
    fun `returns mouse c when both cats are equidistant`() {
        assertEquals("Mouse C", catAndMouse(2, 4, 3))
    }

    @Test
    fun `returns cat a when cat a is at mouse`() {
        assertEquals("Cat A", catAndMouse(5, 10, 5))
    }

    @Test
    fun `returns cat b when cat b is at mouse`() {
        assertEquals("Cat B", catAndMouse(1, 7, 7))
    }
}

