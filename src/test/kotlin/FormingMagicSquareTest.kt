import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FormingMagicSquareTest {
    @Test
    fun `returns correct cost for typical input`() {
        val s = arrayOf(
            arrayOf(4, 9, 2),
            arrayOf(3, 5, 7),
            arrayOf(8, 1, 5)
        )
        assertEquals(1, formingMagicSquare(s))
    }

    @Test
    fun `returns zero for already magic square`() {
        val s = arrayOf(
            arrayOf(8, 1, 6),
            arrayOf(3, 5, 7),
            arrayOf(4, 9, 2)
        )
        assertEquals(0, formingMagicSquare(s))
    }

    @Test
    fun `returns correct cost for reverse magic square`() {
        val s = arrayOf(
            arrayOf(2, 7, 6),
            arrayOf(9, 5, 1),
            arrayOf(4, 3, 8)
        )
        assertEquals(0, formingMagicSquare(s))
    }

    @Test
    fun `returns correct cost for all same numbers`() {
        val s = arrayOf(
            arrayOf(5, 5, 5),
            arrayOf(5, 5, 5),
            arrayOf(5, 5, 5)
        )
        assertEquals(20, formingMagicSquare(s))
    }
}
