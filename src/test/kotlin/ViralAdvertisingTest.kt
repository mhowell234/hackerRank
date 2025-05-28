import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ViralAdvertisingTest {
    @Test
    fun `returns correct value for N1`() {
        assertEquals(2, viralAdvertising(1))
    }

    @Test
    fun `returns correct value for N2`() {
        assertEquals(5, viralAdvertising(2))
    }

    @Test
    fun `returns correct value for N3`() {
        assertEquals(9, viralAdvertising(3))
    }

    @Test
    fun `returns correct value for N4`() {
        assertEquals(15, viralAdvertising(4))
    }

    @Test
    fun `returns correct value for large N`() {
        assertEquals(24, viralAdvertising(5))
        assertEquals(189, viralAdvertising(10))
    }
}

