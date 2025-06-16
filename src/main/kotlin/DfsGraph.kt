class DfsGraph<K>(val adjencyList: Map<K, List<K>>) {
    private val visited = mutableSetOf<K>()
    private val result = mutableListOf<K>()

    fun dfs(): List<K> {
        for (neighbor in adjencyList.keys) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(adjencyList, visited, neighbor, result)
            }
        }

        return result
    }

    private fun dfsRecursive(
        adjencyList: Map<K, List<K>>,
        visited: MutableSet<K>, node: K, result: MutableList<K>
    ) {
        visited.add(node)
        result.add(node)

        for (i in adjencyList.get(node)!!) {
            if (!visited.contains(i)) {
                dfsRecursive(adjencyList, visited, i, result)
            }
        }
    }
}

private fun <K> addEdge(adjencyList: MutableMap<K, MutableList<K>>, u: K, v: K) {
    adjencyList[u]?.add(v)
    adjencyList[v]?.add(u)
}

fun main() {
    val v = 5
    val adjencyList = mutableMapOf<Int, MutableList<Int>>()

    (0..v).forEach { it -> adjencyList.putIfAbsent(it, mutableListOf()) }

    arrayOf(intArrayOf(1, 2), intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(2, 3), intArrayOf(2, 4)).forEach { edge ->
        addEdge(adjencyList, edge[0], edge[1])
    }

    val dfsGraph = DfsGraph(adjencyList);
    val result = dfsGraph.dfs();

    for (i in 0..<result.size) {
        print("${result.get(i)} ");
    }
}
