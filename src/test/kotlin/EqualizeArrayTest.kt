import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EqualizeArrayTest {
    @Test
    fun `returns correct removals for typical input`() {
        assertEquals(2, equalizeArray(arrayOf(3, 3, 2, 1, 3)))
    }

    @Test
    fun `returns zero for single element`() {
        assertEquals(0, equalizeArray(arrayOf(5)))
    }

    @Test
    fun `returns zero for all elements equal`() {
        assertEquals(0, equalizeArray(arrayOf(7, 7, 7, 7)))
    }

    @Test
    fun `returns correct for two values`() {
        assertEquals(1, equalizeArray(arrayOf(1, 2, 2)))
    }

    @Test
    fun `returns correct for all unique`() {
        assertEquals(2, equalizeArray(arrayOf(1, 2, 3)))
    }
}

