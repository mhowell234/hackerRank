import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PositiveNegativeZeroTest {
    @Test
    fun `prints correct ratios for mixed array`() {
        val out = captureStdout {
            plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
        }
        val lines = out.trim().lines()
        assertEquals("0.500000", lines[0])
        assertEquals("0.333333", lines[1])
        assertEquals("0.166667", lines[2])
    }

    @Test
    fun `prints all positive`() {
        val out = captureStdout {
            plusMinus(arrayOf(1, 2, 3))
        }
        val lines = out.trim().lines()
        assertEquals("1.000000", lines[0])
        assertEquals("0.000000", lines[1])
        assertEquals("0.000000", lines[2])
    }

    @Test
    fun `prints all negative`() {
        val out = captureStdout {
            plusMinus(arrayOf(-1, -2, -3))
        }
        val lines = out.trim().lines()
        assertEquals("0.000000", lines[0])
        assertEquals("1.000000", lines[1])
        assertEquals("0.000000", lines[2])
    }

    @Test
    fun `prints all zero`() {
        val out = captureStdout {
            plusMinus(arrayOf(0, 0, 0))
        }
        val lines = out.trim().lines()
        assertEquals("0.000000", lines[0])
        assertEquals("0.000000", lines[1])
        assertEquals("1.000000", lines[2])
    }
}

