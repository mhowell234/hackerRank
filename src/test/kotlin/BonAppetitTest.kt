import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class BonAppetitTest {
    @Test
    fun `prints bon appetit when bill is fair`() {
        val out = captureStdout {
            bonAppetit(arrayOf(2, 4, 6), 2, 3)
        }
        assertTrue(out.trim().contains("Bon Appetit"))
    }

    @Test
    fun `prints refund amount when bill is unfair`() {
        val out = captureStdout {
            bonAppetit(arrayOf(3, 10, 2, 9), 1, 12)
        }
        assertTrue(out.trim().contains("5"))
    }

    @Test
    fun `prints zero refund when anna did not eat anything`() {
        val out = captureStdout {
            bonAppetit(arrayOf(5), 0, 0)
        }
        assertTrue(out.trim().contains("Bon Appetit"))
    }
}
