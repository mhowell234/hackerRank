import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue

class GraphTest {
    @Test
    fun `graph add vertex creates empty neighbor list`() {
        val graph = Graph<String>()
        graph.addVertex("A")
        assertEquals(emptyList<String>(), graph.getNeighbors("A"))
    }

    @Test
    fun `graph add edge creates bidirectional connection`() {
        val graph = Graph<String>()
        graph.addVertex("A")
        graph.addVertex("B")
        graph.addEdge("A", "B")
        val neighborsA = graph.getNeighbors("A")
        val neighborsB = graph.getNeighbors("B")
        assertTrue(neighborsA?.contains("B") == true)
        assertTrue(neighborsB?.contains("A") == true)
    }

    @Test
    fun `graph get neighbors returns null for missing vertex`() {
        val graph = Graph<String>()
        assertNull(graph.getNeighbors("Missing"))
    }

    @Test
    fun `graph handles multiple edges and vertices`() {
        val graph = Graph<Int>()
        (1..4).forEach { graph.addVertex(it) }
        graph.addEdge(1, 2)
        graph.addEdge(1, 3)
        graph.addEdge(2, 4)
        assertEquals(listOf(2, 3), graph.getNeighbors(1))
        assertEquals(listOf(1, 4), graph.getNeighbors(2))
        assertEquals(listOf(1), graph.getNeighbors(3))
        assertEquals(listOf(2), graph.getNeighbors(4))
    }

    @Test
    fun `graph print graph does not throw`() {
        val graph = Graph<String>()
        graph.addVertex("X")
        graph.addVertex("Y")
        graph.addEdge("X", "Y")
        graph.printGraph()
    }
}