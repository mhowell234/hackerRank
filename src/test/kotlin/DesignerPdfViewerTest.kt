import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DesignerPdfViewerTest {
    @Test
    fun `returns correct area for typical word`() {
        val h = arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7)
        assertEquals(28, designerPdfViewer(h, "zaba"))
    }

    @Test
    fun `returns zero for empty word`() {
        val h = Array(26) { 1 }
        assertEquals(0, designerPdfViewer(h, ""))
    }

    @Test
    fun `returns correct area for single letter`() {
        val h = Array(26) { 2 }
        assertEquals(2, designerPdfViewer(h, "a"))
    }

    @Test
    fun `returns correct area for all same height`() {
        val h = Array(26) { 5 }
        assertEquals(25, designerPdfViewer(h, "abcde"))
    }
}

