import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JumpingOnCloudsTest {
    @Test
    fun `returns correct jumps for typical input`() {
        assertEquals(4, jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0)))
    }

    @Test
    fun `returns zero for single cloud`() {
        assertEquals(0, jumpingOnClouds(arrayOf(0)))
    }

    @Test
    fun `returns one for two safe clouds`() {
        assertEquals(1, jumpingOnClouds(arrayOf(0, 0)))
    }

    @Test
    fun `returns correct for all safe clouds`() {
        assertEquals(2, jumpingOnClouds(arrayOf(0, 0, 0, 0)))
    }

    @Test
    fun `returns correct for alternating unsafe clouds`() {
        assertEquals(2, jumpingOnClouds(arrayOf(0, 1, 0, 1, 0)))
    }
}

