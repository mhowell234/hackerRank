import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ModuloTest {
    @Test
    fun `rounds grades correctly for typical input`() {
        val grades = arrayOf(73, 67, 38, 33)
        assertArrayEquals(arrayOf(75, 67, 40, 33), gradingStudents(grades))
    }

    @Test
    fun `does not round grades below 38`() {
        val grades = arrayOf(37, 29, 0)
        assertArrayEquals(arrayOf(37, 29, 0), gradingStudents(grades))
    }

    @Test
    fun `does not round when difference is less than 3`() {
        val grades = arrayOf(84, 82, 39)
        assertArrayEquals(arrayOf(85, 82, 40), gradingStudents(grades))
    }

    @Test
    fun `handles all grades already rounded`() {
        val grades = arrayOf(40, 45, 50)
        assertArrayEquals(arrayOf(40, 45, 50), gradingStudents(grades))
    }

    @Test
    fun `handles empty array`() {
        val grades = arrayOf<Int>()
        assertArrayEquals(arrayOf<Int>(), gradingStudents(grades))
    }
}

