import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PickingNumbersTest {
    @Test
    fun `returns correct for typical input`() {
        val a = arrayOf(4, 6, 5, 3, 3, 1)
        assertEquals(3, pickingNumbers(a))
    }

    @Test
    fun `returns array size when all elements are same`() {
        val a = arrayOf(2, 2, 2, 2)
        assertEquals(4, pickingNumbers(a))
    }

    @Test
    fun `returns correct for consecutive numbers`() {
        val a = arrayOf(1, 2, 2, 3, 1, 2)
        assertEquals(5, pickingNumbers(a))
    }

    @Test
    fun `returns one for single element`() {
        val a = arrayOf(7)
        assertEquals(1, pickingNumbers(a))
    }

    @Test
    fun `returns correct for no consecutive numbers`() {
        val a = arrayOf(1, 3, 5, 7)
        assertEquals(1, pickingNumbers(a))
    }
}

