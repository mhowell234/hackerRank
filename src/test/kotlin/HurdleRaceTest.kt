import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HurdleRaceTest {
    @Test
    fun `returns zero when no doses needed`() {
        assertEquals(0, hurdleRace(7, arrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `returns correct doses needed`() {
        assertEquals(3, hurdleRace(2, arrayOf(2, 5, 4, 5, 2)))
    }

    @Test
    fun `returns zero when max equals K`() {
        assertEquals(0, hurdleRace(5, arrayOf(1, 2, 5, 3)))
    }

    @Test
    fun `returns correct for single hurdle`() {
        assertEquals(3, hurdleRace(2, arrayOf(5)))
    }
}

