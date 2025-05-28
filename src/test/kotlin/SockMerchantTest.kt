import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SockMerchantTest {
    @Test
    fun `returns correct pairs for typical input`() {
        val ar = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
        assertEquals(3, sockMerchant(9, ar))
    }

    @Test
    fun `returns zero when no pairs`() {
        val ar = arrayOf(1, 2, 3, 4)
        assertEquals(0, sockMerchant(4, ar))
    }

    @Test
    fun `returns correct for all pairs`() {
        val ar = arrayOf(1, 1, 2, 2, 3, 3)
        assertEquals(3, sockMerchant(6, ar))
    }

    @Test
    fun `returns correct for single sock`() {
        val ar = arrayOf(5)
        assertEquals(0, sockMerchant(1, ar))
    }

    @Test
    fun `returns correct for empty array`() {
        val ar = arrayOf<Int>()
        assertEquals(0, sockMerchant(0, ar))
    }
}

