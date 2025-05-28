import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class KangarooTest {
    @Test
    fun `returns YES when kangaroos meet`() {
        assertEquals("YES", kangaroo(0, 3, 4, 2))
    }

    @Test
    fun `returns NO when kangaroos never meet`() {
        assertEquals("NO", kangaroo(0, 2, 5, 3))
    }

    @Test
    fun `returns YES when kangaroos start together`() {
        assertEquals("YES", kangaroo(5, 2, 5, 2))
    }

    @Test
    fun `returns NO when kangaroos have same speed but different start`() {
        assertEquals("NO", kangaroo(0, 2, 5, 2))
    }

    @Test
    fun `returns NO when kangaroo behind is slower`() {
        assertEquals("NO", kangaroo(0, 1, 5, 2))
    }
}

