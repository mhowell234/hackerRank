import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LibraryFineTest {
    @Test
    fun `returns zero when returned on time`() {
        assertEquals(0, libraryFine(6, 6, 2015, 6, 6, 2015))
    }

    @Test
    fun `returns fine for late days same month year`() {
        assertEquals(45, libraryFine(9, 6, 2015, 6, 6, 2015))
    }

    @Test
    fun `returns fine for late months same year`() {
        assertEquals(1000, libraryFine(1, 8, 2015, 1, 6, 2015))
    }

    @Test
    fun `returns fine for late year`() {
        assertEquals(10000, libraryFine(1, 1, 2016, 31, 12, 2015))
    }

    @Test
    fun `returns zero when returned before due date`() {
        assertEquals(0, libraryFine(1, 1, 2015, 2, 1, 2015))
    }
}

