import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumIslandsTest {
    @Test
    fun `returns correct count for typical grid`() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '1', '1'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '1', '1', '0', '1')
        )
        assertEquals(4, numIslands(grid.map { it.copyOf() }.toTypedArray()))
    }

    @Test
    fun `returns zero for all water`() {
        val grid = arrayOf(
            charArrayOf('0', '0'),
            charArrayOf('0', '0')
        )
        assertEquals(0, numIslands(grid.map { it.copyOf() }.toTypedArray()))
    }

    @Test
    fun `returns one for all land`() {
        val grid = arrayOf(
            charArrayOf('1', '1'),
            charArrayOf('1', '1')
        )
        assertEquals(1, numIslands(grid.map { it.copyOf() }.toTypedArray()))
    }

    @Test
    fun `returns correct for single cell islands`() {
        val grid = arrayOf(
            charArrayOf('1', '0', '1'),
            charArrayOf('0', '1', '0'),
            charArrayOf('1', '0', '1')
        )
        assertEquals(5, numIslands(grid.map { it.copyOf() }.toTypedArray()))
    }

    @Test
    fun `returns zero for empty grid`() {
        val grid = arrayOf<CharArray>()
        assertEquals(0, numIslands(grid))
    }
}

