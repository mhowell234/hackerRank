import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DeterminingDnaHealthTest {
    @Test
    fun `returns correct min max health for typical queries`() {
        val genes = arrayOf("a", "b", "c", "aa", "d", "b")
        val health = arrayOf(1, 2, 3, 4, 5, 6)
        val queries = arrayOf(
            Triple(1, 5, "caaab"),
            Triple(0, 4, "xyz"),
            Triple(2, 4, "bcdybc")
        )
        val result = determineDnaHealth(genes, health, queries)
        assertEquals("0 19", result)
    }

    @Test
    fun `returns zero when no genes match`() {
        val genes = arrayOf("a", "b")
        val health = arrayOf(1, 2)
        val queries = arrayOf(Triple(0, 1, "xyz"))
        val result = determineDnaHealth(genes, health, queries)
        assertEquals("0 0", result)
    }

    @Test
    fun `returns correct for single gene`() {
        val genes = arrayOf("a")
        val health = arrayOf(5)
        val queries = arrayOf(Triple(0, 0, "aaaa"))
        val result = determineDnaHealth(genes, health, queries)
        assertEquals("20 20", result)
    }
}

