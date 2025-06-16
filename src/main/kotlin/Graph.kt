class Graph<T> {
    private val adjacencyList: MutableMap<T, MutableList<T>> = mutableMapOf()

    fun addVertex(vertex: T) {
        adjacencyList[vertex] = mutableListOf()
    }

    fun addEdge(vertex1: T, vertex2: T) {
        adjacencyList[vertex1]?.add(vertex2)
        adjacencyList[vertex2]?.add(vertex1) // For undirected graphs
    }

    fun getNeighbors(vertex: T): List<T>? {
        return adjacencyList[vertex]
    }

    fun printGraph() {
        for ((vertex, neighbors) in adjacencyList) {
            println("$vertex: ${neighbors.joinToString(", ")}")
        }
    }
}

fun main() {
    val graph = Graph<String>()
    graph.addVertex("A")
    graph.addVertex("B")
    graph.addVertex("C")
    graph.addEdge("A", "B")
    graph.addEdge("B", "C")

    graph.printGraph()
    println("Neighbors of B: ${graph.getNeighbors("B")}")

    val intGraph = Graph<Int>()
    intGraph.addVertex(1)
    intGraph.addVertex(2)
    intGraph.addVertex(3)
    intGraph.addEdge(1, 2)
    intGraph.addEdge(2, 3)

    intGraph.printGraph()
    println("Neighbors of 2: ${intGraph.getNeighbors(2)}")
}