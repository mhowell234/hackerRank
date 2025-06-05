import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BiggerIsGreaterTest {
    @Test
    fun `returns next permutation for typical input`() {
        assertEquals("lmon", biggerIsGreater("lmno"))
        assertEquals("abdc", biggerIsGreater("abcd"))
        assertEquals("acbd", biggerIsGreater("abdc"))
    }

    @Test
    fun `returns no answer when no greater permutation`() {
        assertEquals("no answer", biggerIsGreater("dcba"))
        assertEquals("no answer", biggerIsGreater("dcbb"))
    }

    @Test
    fun `returns correct for longer string`() {
        assertEquals("fedcbabdc", biggerIsGreater("fedcbabcd"))
    }

    @Test
    fun `returns no answer for single char`() {
        assertEquals("no answer", biggerIsGreater("a"))
    }
}

