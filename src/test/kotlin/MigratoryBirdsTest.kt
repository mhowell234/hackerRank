import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MigratoryBirdsTest {
    @Test
    fun `returns smallest type when multiple have same max frequency`() {
        val arr = arrayOf(1, 4, 4, 4, 5, 5, 5, 3)
        assertEquals(4, migratoryBirds(arr))
    }

    @Test
    fun `returns type when all are same`() {
        val arr = arrayOf(2, 2, 2, 2)
        assertEquals(2, migratoryBirds(arr))
    }

    @Test
    fun `returns smallest type for tie`() {
        val arr = arrayOf(1, 2, 2, 1)
        assertEquals(1, migratoryBirds(arr))
    }

    @Test
    fun `returns type for single element`() {
        val arr = arrayOf(7)
        assertEquals(7, migratoryBirds(arr))
    }

    @Test
    fun `returns zero for empty array`() {
        val arr = arrayOf<Int>()
        assertEquals(0, migratoryBirds(arr))
    }
}

