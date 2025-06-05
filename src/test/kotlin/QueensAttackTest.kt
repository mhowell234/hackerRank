import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QueensAttackTest {
    @Test
    fun `returns correct moves no obstacles`() {
        assertEquals(27, queensAttack(8, 0, 4, 4, arrayOf()))
    }

//    @Test
//    fun returnsCorrectMovesWithObstacles() {
//        val obstacles = arrayOf(arrayOf(3, 5), arrayOf(6, 6))
//        assertEquals(24, queensAttack(8, 2, 4, 4, obstacles))
//    }

    @Test
    fun `throws exception for invalid queen position`() {
        assertThrows(IllegalArgumentException::class.java) {
            queensAttack(8, 0, 9, 4, arrayOf())
        }
    }
}

