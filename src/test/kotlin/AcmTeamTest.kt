import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AcmTeamTest {
    @Test
    fun `returns correct max topics and team count for typical input`() {
        val topic = arrayOf("10101", "11100", "11010", "00101")
        assertArrayEquals(arrayOf(5, 2), acmTeam(topic))
    }

    @Test
    fun `returns correct for all same topics`() {
        val topic = arrayOf("111", "111", "111")
        assertArrayEquals(arrayOf(3, 3), acmTeam(topic))
    }

    @Test
    fun `returns correct for no overlap`() {
        val topic = arrayOf("100", "010", "001")
        assertArrayEquals(arrayOf(2, 3), acmTeam(topic))
    }

    @Test
    fun `returns correct for single person`() {
        val topic = arrayOf("10101")
        assertArrayEquals(arrayOf(0, 0), acmTeam(topic))
    }
}

