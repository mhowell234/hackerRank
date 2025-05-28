import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CircularArrayRotationTest {
    @Test
    fun `returns correct values for typical input`() {
        val a = arrayOf(1, 2, 3)
        val queries = arrayOf(0, 1, 2)
        assertArrayEquals(arrayOf(2, 3, 1), circularArrayRotation(a, 2, queries))
    }

    @Test
    fun `returns original array when zero rotations`() {
        val a = arrayOf(1, 2, 3)
        val queries = arrayOf(0, 1, 2)
        assertArrayEquals(arrayOf(1, 2, 3), circularArrayRotation(a, 0, queries))
    }

    @Test
    fun `handles single element array`() {
        val a = arrayOf(5)
        val queries = arrayOf(0)
        assertArrayEquals(arrayOf(5), circularArrayRotation(a, 10, queries))
    }

    @Test
    fun `returns correct for partial queries`() {
        val a = arrayOf(10, 20, 30, 40)
        val queries = arrayOf(1, 3)
        assertArrayEquals(arrayOf(40, 20), circularArrayRotation(a, 2, queries))
    }
}

