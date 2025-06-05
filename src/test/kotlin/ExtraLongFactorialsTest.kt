import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ExtraLongFactorialsTest {
    @Test
    fun `prints correct factorial for small number`() {
        val out = captureStdout {
            extraLongFactorials(5)
        }
        assertTrue(out.trim().endsWith("120"))
    }

    @Test
    fun `prints correct factorial for large number`() {
        val out = captureStdout {
            extraLongFactorials(20)
        }
        assertTrue(out.trim().endsWith("2432902008176640000"))
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

