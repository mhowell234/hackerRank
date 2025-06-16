import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RobinKarpTest {
    @Test
    fun `finds all occurrences of pattern`() {
        val robinKarp = RobinKarp()
        val text = "geeksforgeeks"
        val pattern = "geeks"
        assertEquals(listOf(0, 8), robinKarp.search(text, pattern))
    }

    @Test
    fun `returns empty list when pattern not found`() {
        val robinKarp = RobinKarp()
        val text = "abcdefgh"
        val pattern = "xyz"
        assertEquals(emptyList<Int>(), robinKarp.search(text, pattern))
    }

    @Test
    fun `returns empty list when pattern longer than text`() {
        val robinKarp = RobinKarp()
        val text = "abc"
        val pattern = "abcd"
        assertEquals(emptyList<Int>(), robinKarp.search(text, pattern))
    }

    @Test
    fun `finds pattern at start and end`() {
        val robinKarp = RobinKarp()
        val text = "abcdeabc"
        val pattern = "abc"
        assertEquals(listOf(0, 5), robinKarp.search(text, pattern))
    }

    @Test
    fun `finds overlapping patterns`() {
        val robinKarp = RobinKarp()
        val text = "aaaaa"
        val pattern = "aaa"
        assertEquals(listOf(0, 1, 2), robinKarp.search(text, pattern))
    }
}
