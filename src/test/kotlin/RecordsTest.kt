import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RecordsTest {
    @Test
    fun `returns correct record counts for typical input`() {
        val scores = arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1)
        assertArrayEquals(arrayOf(2, 4), breakingRecords(scores))
    }

    @Test
    fun `returns zero for single score`() {
        val scores = arrayOf(100)
        assertArrayEquals(arrayOf(0, 0), breakingRecords(scores))
    }

    @Test
    fun `returns zero for all same scores`() {
        val scores = arrayOf(5, 5, 5, 5)
        assertArrayEquals(arrayOf(0, 0), breakingRecords(scores))
    }

    @Test
    fun `returns correct for increasing scores`() {
        val scores = arrayOf(1, 2, 3, 4, 5)
        assertArrayEquals(arrayOf(4, 0), breakingRecords(scores))
    }

    @Test
    fun `returns correct for decreasing scores`() {
        val scores = arrayOf(5, 4, 3, 2, 1)
        assertArrayEquals(arrayOf(0, 4), breakingRecords(scores))
    }
}

