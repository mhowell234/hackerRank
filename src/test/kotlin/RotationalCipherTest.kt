import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RotationalCipherTest {
    @Test
    fun rotatesLettersAndDigitsCorrectly() {
        val input = "abcdefghijklmNOPQRSTUVWXYZ0123456789"
        val rotationFactor = 39
        val expected = "nopqrstuvwxyzABCDEFGHIJKLM9012345678"
        assertEquals(expected, rotationalCipher(input, rotationFactor))
    }

    @Test
    fun `leaves non-alphanumeric unchanged`() {
        val input = "Hello, World! 123."
        val rotationFactor = 4
        val expected = "Lipps, Asvph! 567."
        assertEquals(expected, rotationalCipher(input, rotationFactor))
    }

    @Test
    fun `handles zero rotation`() {
        val input = "Test123"
        val rotationFactor = 0
        assertEquals("Test123", rotationalCipher(input, rotationFactor))
    }

    @Test
    fun `handles full rotation`() {
        val input = "abcXYZ012"
        val rotationFactor = 26
        val expected = "abcXYZ678"
        assertEquals(expected, rotationalCipher(input, rotationFactor))
    }

    @Test
    fun `handles empty string`() {
        assertEquals("", rotationalCipher("", 10))
    }
}

