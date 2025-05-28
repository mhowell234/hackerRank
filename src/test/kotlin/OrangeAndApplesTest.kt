import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OrangeAndApplesTest {
    @Test
    fun `prints correct counts for typical input`() {
        val out = captureStdout {
            countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
        }
        val lines = out.trim().lines()
        assertEquals("1", lines[0])
        assertEquals("1", lines[1])
    }

    @Test
    fun `prints zero when no fruits land on house`() {
        val out = captureStdout {
            countApplesAndOranges(7, 11, 5, 15, arrayOf(-10, -20), arrayOf(10, 20))
        }
        val lines = out.trim().lines()
        assertEquals("0", lines[0])
        assertEquals("0", lines[1])
    }

    @Test
    fun `prints correct when all fruits land on house`() {
        val out = captureStdout {
            countApplesAndOranges(7, 11, 7, 11, arrayOf(0, 0, 0), arrayOf(0, 0))
        }
        val lines = out.trim().lines()
        assertEquals("3", lines[0])
        assertEquals("2", lines[1])
    }
}

