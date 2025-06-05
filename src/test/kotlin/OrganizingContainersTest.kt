import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OrganizingContainersTest {
    @Test
    fun `returns possible for already organized`() {
        val matrix = arrayOf(
            arrayOf(1, 1),
            arrayOf(1, 1)
        )
        assertEquals("Possible", organizingContainers(matrix))
    }

    @Test
    fun `returns impossible for unsolvable case`() {
        val matrix = arrayOf(
            arrayOf(0, 2),
            arrayOf(1, 1)
        )
        assertEquals("Impossible", organizingContainers(matrix))
    }

    @Test
    fun `returns possible for larger solvable case`() {
        val matrix = arrayOf(
            arrayOf(0, 2, 1),
            arrayOf(1, 1, 1),
            arrayOf(2, 0, 0)
        )
        assertEquals("Possible", organizingContainers(matrix))
    }

    @Test
    fun `returns impossible for larger unsolvable case`() {
        val matrix = arrayOf(
            arrayOf(1, 3, 1),
            arrayOf(2, 1, 2),
            arrayOf(3, 3, 3)
        )
        assertEquals("Impossible", organizingContainers(matrix))
    }
}

