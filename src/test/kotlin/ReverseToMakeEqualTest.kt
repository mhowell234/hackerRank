import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseToMakeEqualTest {
    @Test
    fun `returns true for equal arrays`() {
        val target = intArrayOf(1, 2, 3, 4)
        val arr = intArrayOf(4, 3, 2, 1)
        assertTrue(canBeEqual(target, arr))
    }

    @Test
    fun `returns false for different elements`() {
        val target = intArrayOf(1, 2, 3, 4)
        val arr = intArrayOf(2, 4, 1, 5)
        assertFalse(canBeEqual(target, arr))
    }

    @Test
    fun `returns true for same elements different order`() {
        val target = intArrayOf(1, 2, 2, 3)
        val arr = intArrayOf(2, 1, 3, 2)
        assertTrue(canBeEqual(target, arr))
    }

    @Test
    fun `returns false for different lengths`() {
        val target = intArrayOf(1, 2, 3)
        val arr = intArrayOf(1, 2, 3, 4)
        assertFalse(canBeEqual(target, arr))
    }

    @Test
    fun `returns true for empty arrays`() {
        val target = intArrayOf()
        val arr = intArrayOf()
        assertTrue(canBeEqual(target, arr))
    }
}

