import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CutTheSticksTest {
    @Test
    fun `returns correct cuts for typical input`() {
        val arr = arrayOf(5, 4, 4, 2, 2, 8)
        assertArrayEquals(arrayOf(6, 4, 2, 1), cutTheSticks(arr.copyOf()))
    }

    @Test
    fun `returns single cut for all same length`() {
        val arr = arrayOf(3, 3, 3)
        assertArrayEquals(arrayOf(3), cutTheSticks(arr.copyOf()))
    }

    @Test
    fun `returns empty for empty array`() {
        val arr = arrayOf<Int>()
        assertArrayEquals(arrayOf<Int>(), cutTheSticks(arr.copyOf()))
    }

    @Test
    fun `returns correct for already zero`() {
        val arr = arrayOf(0, 0, 0)
        assertArrayEquals(arrayOf<Int>(), cutTheSticks(arr.copyOf()))
    }

    @Test
    fun `returns correct for single stick`() {
        val arr = arrayOf(7)
        assertArrayEquals(arrayOf(1), cutTheSticks(arr.copyOf()))
    }
}

