import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FoldingTest {
    @Test
    fun `computes sum with reduce`() {
        val numbers = listOf(5, 2, 10, 4)
        val simpleSum = numbers.reduce { sum, element -> sum + element }
        assertEquals(21, simpleSum)
    }

    @Test
    fun `computes sum doubled with fold`() {
        val numbers = listOf(5, 2, 10, 4)
        val sumDoubled = numbers.fold(0) { sum, element -> sum + element * 2 }
        assertEquals(42, sumDoubled)
    }

    @Test
    fun `fold with empty list returns initial value`() {
        val numbers = emptyList<Int>()
        val result = numbers.fold(100) { sum, element -> sum + element }
        assertEquals(100, result)
    }
}

