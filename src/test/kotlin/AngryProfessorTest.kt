import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AngryProfessorTest {

    @Test
    fun `returns YES when threshold not met`() {
        assertEquals("YES", angryProfessor(3, arrayOf(-1, -3, 4, 2)))
    }

    @Test
    fun `returns NO when all arrive on time`() {
        assertEquals("NO", angryProfessor(1, arrayOf(0, -1, -2)))
    }

    @Test
    fun `returns YES when no one arrives on time`() {
        assertEquals("YES", angryProfessor(1, arrayOf(1, 2, 3)))
    }
}

