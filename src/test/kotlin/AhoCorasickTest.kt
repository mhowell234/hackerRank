import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AhoCorasickTest {
    @Test
    fun `finds all pattern matches in text`() {
        val patterns = listOf("a", "b", "c", "aa", "d", "b")
        val text = "caaab"
        val ahoCorasick = AhoCorasick(patterns)
        val matches = ahoCorasick.search(text)
        assertEquals(listOf(1, 2, 3), matches[0])
        assertEquals(listOf(4), matches[1])
        assertEquals(listOf(0), matches[2])
        assertEquals(listOf(1, 2), matches[3])
        assertEquals(emptyList<Int>(), matches[4])
        assertEquals(listOf(4), matches[5])
    }

    @Test
    fun `returns empty for no matches`() {
        val patterns = listOf("x", "y", "z")
        val text = "abcde"
        val ahoCorasick = AhoCorasick(patterns)
        val matches = ahoCorasick.search(text)
        assertTrue(matches.all { it.isEmpty() })
    }

    @Test
    fun `handles overlapping patterns`() {
        val patterns = listOf("ab", "bc", "abc")
        val text = "abc"
        val ahoCorasick = AhoCorasick(patterns)
        val matches = ahoCorasick.search(text)
        assertEquals(listOf(0), matches[0])
        assertEquals(listOf(1), matches[1])
        assertEquals(listOf(0), matches[2])
    }
}

