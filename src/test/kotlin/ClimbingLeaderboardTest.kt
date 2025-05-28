import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ClimbingLeaderboardTest {
    @Test
    fun `returns correct ranks for typical input`() {
        val ranked = arrayOf(100, 90, 90, 80, 75, 60)
        val player = arrayOf(50, 65, 77, 90, 102)
        assertArrayEquals(arrayOf(6, 5, 4, 2, 1), climbingLeaderboard(ranked, player))
    }

    @Test
    fun `returns first rank for top score`() {
        val ranked = arrayOf(100, 90, 80)
        val player = arrayOf(120)
        assertArrayEquals(arrayOf(1), climbingLeaderboard(ranked, player))
    }

    @Test
    fun `returns last rank for lowest score`() {
        val ranked = arrayOf(100, 90, 80)
        val player = arrayOf(50)
        assertArrayEquals(arrayOf(4), climbingLeaderboard(ranked, player))
    }

    @Test
    fun `returns correct ranks for duplicate player scores`() {
        val ranked = arrayOf(100, 90, 80)
        val player = arrayOf(90, 90, 80)
        assertArrayEquals(arrayOf(2, 2, 3), climbingLeaderboard(ranked, player))
    }

    @Test
    fun `returns correct ranks for empty player array`() {
        val ranked = arrayOf(100, 90, 80)
        val player = arrayOf<Int>()
        assertArrayEquals(arrayOf<Int>(), climbingLeaderboard(ranked, player))
    }
}

