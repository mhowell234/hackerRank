import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AppendAndDeleteTest {
    @Test
    fun returnsYesForTypicalCase() {
        assertEquals("Yes", appendAndDelete("hackerhappy", "hackerrank", 9))
    }

    @Test
    fun `returns no when not enough operations`() {
        assertEquals("No", appendAndDelete("aba", "aba", 1))
    }

    @Test
    fun `returns yes when exact operations`() {
        assertEquals("Yes", appendAndDelete("ashley", "ash", 3))
    }

    @Test
    fun `returns yes when k is large enough`() {
        assertEquals("Yes", appendAndDelete("abc", "def", 10))
    }

    @Test
    fun `returns yes when strings are equal and k is even`() {
        assertEquals("Yes", appendAndDelete("abc", "abc", 4))
    }

    @Test
    fun `returns no when strings are equal and k odd`() {
        assertEquals("No", appendAndDelete("abc", "abc", 3))
    }
}

