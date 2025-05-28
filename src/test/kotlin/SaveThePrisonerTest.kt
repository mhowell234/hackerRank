import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SaveThePrisonerTest {
    @Test
    fun `returns correct prisoner for typical input`() {
        assertEquals(2, saveThePrisoner(5, 2, 1))
        assertEquals(3, saveThePrisoner(5, 2, 2))
    }

    @Test
    fun `returns correct for single prisoner`() {
        assertEquals(1, saveThePrisoner(1, 1, 1))
    }

    @Test
    fun `returns correct for wrap around`() {
        assertEquals(1, saveThePrisoner(5, 6, 1))
    }

    @Test
    fun `returns correct for large values`() {
        assertEquals(999999999, saveThePrisoner(1000000000, 999999998, 2))
    }
}

