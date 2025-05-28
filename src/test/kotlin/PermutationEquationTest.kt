import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PermutationEquationTest {
    @Test
    fun `returns correct permutation for typical input`() {
        val p = arrayOf(5, 2, 1, 3, 4)
        assertArrayEquals(arrayOf(4, 2, 5, 1, 3), permutationEquation(p))
    }

    @Test
    fun `returns correct for single element`() {
        val p = arrayOf(1)
        assertArrayEquals(arrayOf(1), permutationEquation(p))
    }

    @Test
    fun `returns correct for two elements`() {
        val p = arrayOf(2, 1)
        assertArrayEquals(arrayOf(1, 2), permutationEquation(p))
    }
}

