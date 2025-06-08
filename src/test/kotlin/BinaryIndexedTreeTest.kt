import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinaryIndexedTreeTest {
    @Test
    fun `returns correct sum after single add`() {
        val bit = BinaryIndexedTree(5)
        bit.addValue(2, 10)
        assertEquals(10, bit.getSum(2))
        assertEquals(0, bit.getSum(1))
    }

    @Test
    fun `returns correct sum after multiple adds`() {
        val bit = BinaryIndexedTree(5)
        bit.addValue(1, 5)
        bit.addValue(2, 3)
        bit.addValue(3, 7)
        assertEquals(15, bit.getSum(3))
        assertEquals(8, bit.getSum(2))
        assertEquals(5, bit.getSum(1))
    }

    @Test
    fun `throws exception for invalid index`() {
        val bit = BinaryIndexedTree(3)
        assertThrows(IllegalArgumentException::class.java) { bit.addValue(0, 1) }
        assertThrows(IllegalArgumentException::class.java) { bit.getSum(0) }
        assertThrows(IllegalArgumentException::class.java) { bit.addValue(4, 1) }
        assertThrows(IllegalArgumentException::class.java) { bit.getSum(4) }
    }

    @Test
    fun `handles large values`() {
        val bit = BinaryIndexedTree(2)
        bit.addValue(1, Long.MAX_VALUE)
        assertEquals(Long.MAX_VALUE, bit.getSum(1))
    }
}

