import kotlin.random.Random

class LowestCommonAncestorWithDuplicates<K>(val root: TreeNode<K>) {

    fun findCommonAncestor(value1: K, value2: K): TreeNode<K>? {
        if (root == null) return null

        val pathsToNode1 = mutableListOf<MutableList<TreeNode<K>>>()
        val pathsToNode2 = mutableListOf<MutableList<TreeNode<K>>>()

        if (!findPath(root, value1, pathsToNode1) || !findPath(root, value2, pathsToNode2)) return null

        var lca: TreeNode<K>? = null
        val minPath1Size = pathsToNode1.minByOrNull { it.size }!!.size
        val minPath2Size = pathsToNode2.minByOrNull { it.size }!!.size
        val minPathSize = Math.min(minPath1Size, minPath2Size)

        for (i in 0 until minPathSize) {
            if (pathsToNode1[i] == pathsToNode2[i]) {
                lca = pathsToNode1[i][0]
            } else {
                break
            }
        }
        return lca
    }

    private fun findPath(root: TreeNode<K>, target: K, paths: MutableList<MutableList<TreeNode<K>>>): Boolean {
        if (root == null) return false

        root.children.indices.forEach { i ->
            {
                if (paths.size <= i || null == paths[i]) {
                    paths.add(mutableListOf())
                }

                paths.indices.forEach { i -> paths[i].add(root) }
            }

            if (root.value == target) return true

            root.children.forEach { child ->
                if (findPath(child, target, paths)) {
                    paths.forEach { it.add(root) }
                    return true
                }
            }

            paths.forEach { it.removeAt(it.size - 1) }
        }
        return false
    }
}

private fun buildTree(): TreeNode<Int> {
    val root = TreeNode(0)
    (0..< 10).forEach { i ->
        root.children.add(TreeNode(Random.nextInt(1, 100), root))
        (0..< 20).forEach { j ->
            root.children[i].children.add(TreeNode(Random.nextInt(1, 100), root.children[i]))
            (0..< 20).forEach { _ ->
                root.children[i].children[j].children.add(TreeNode(Random.nextInt(0, 100), root.children[i].children[j]))
            }
        }
    }

    return root
}

fun main() {
    val lca = LowestCommonAncestorWithDuplicates(buildTree())

    val randomNumber1 = Random.nextInt(0, 100)
    val randomNumber2 = Random.nextInt(0, 100)

    println(lca.findCommonAncestor(randomNumber1, randomNumber2))
}