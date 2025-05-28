import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MoneySpentTest {
    @Test
    fun `returns correct max spend within budget`() {
        val keyboards = arrayOf(3, 1)
        val drives = arrayOf(5, 2, 8)
        assertEquals(9, getMoneySpent(keyboards, drives, 10))
    }

    @Test
    fun `returns minus one when nothing affordable`() {
        val keyboards = arrayOf(40, 50)
        val drives = arrayOf(60, 70)
        assertEquals(-1, getMoneySpent(keyboards, drives, 10))
    }

    @Test
    fun `returns exact budget if possible`() {
        val keyboards = arrayOf(4, 5)
        val drives = arrayOf(5, 6)
        assertEquals(10, getMoneySpent(keyboards, drives, 10))
    }

    @Test
    fun `returns correct for single keyboard and drive`() {
        val keyboards = arrayOf(7)
        val drives = arrayOf(2)
        assertEquals(9, getMoneySpent(keyboards, drives, 10))
    }

    @Test
    fun `returns minus one for empty arrays`() {
        val keyboards = arrayOf<Int>()
        val drives = arrayOf<Int>()
        assertEquals(-1, getMoneySpent(keyboards, drives, 10))
    }
}

