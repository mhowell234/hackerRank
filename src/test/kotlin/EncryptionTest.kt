import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EncryptionTest {
    @Test
    fun `returns correct encryption for typical input`() {
        assertEquals("hae and via ecy", encryption("have a nice day"))
    }

    @Test
    fun `returns correct encryption for single word`() {
        assertEquals("clu hlt io", encryption("chillout"))
    }

    @Test
    fun `returns correct encryption for empty string`() {
        assertEquals("", encryption(""))
    }
}

