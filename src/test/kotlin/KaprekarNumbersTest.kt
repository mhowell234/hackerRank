import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class KaprekarNumbersTest {
    @Test
    fun `prints kaprekar numbers for valid range`() {
        val out = captureStdout {
            kaprekarNumbers(1, 100)
        }
        assertTrue(out.trim().contains("1 9 45 55 99"))
    }

    @Test
    fun `prints invalid range for no kaprekar numbers`() {
        val out = captureStdout {
            kaprekarNumbers(2, 3)
        }
        assertEquals("INVALID RANGE", out.trim())
    }

    @Test
    fun `prints invalid range for invalid input`() {
        val out = captureStdout {
            kaprekarNumbers(100, 1)
        }
        assertEquals("INVALID RANGE", out.trim())
    }

    private fun captureStdout(block: () -> Unit): String {
        val originalOut = System.out
        val baos = ByteArrayOutputStream()
        System.setOut(PrintStream(baos))
        try {
            block()
        } finally {
            System.setOut(originalOut)
        }
        return baos.toString()
    }
}

