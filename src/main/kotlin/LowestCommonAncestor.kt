import kotlin.random.Random

class LowestCommonAncestor<K>(val root: TreeNode<K>) {

    fun findCommonAncestor(value1: K, value2: K): TreeNode<K>? {
        val pathToNode1 = findPath(this.root, value1)
        val pathToNode2 = findPath(this.root, value2)

        if (pathToNode1 == null || pathToNode2 == null) return null

        var i = 0
        while (i < pathToNode1.size && i < pathToNode2.size && pathToNode1[i] == pathToNode2[i]) {
            i++
        }

        return if (i > 0) pathToNode1[i - 1] else null
    }

    private fun findPath(root: TreeNode<K>, target: K): List<TreeNode<K>>? {
        if (root.value == target) return listOf(root)

        for (child in root.children) {
            val path = findPath(child, target)
            if (path != null) {
                return listOf(root) + path
            }
        }

        return null
    }
}

private fun buildTree(): TreeNode<Int> {

    var value = 1
    val root = TreeNode(value)
    (0..< 10).forEach { i ->
        root.children.add(TreeNode(++value, root))
        (0..< 20).forEach { j ->
            root.children[i].children.add(TreeNode(++value, root.children[i]))
            (0..< 20).forEach { _ ->
                root.children[i].children[j].children.add(TreeNode(++value, root.children[i].children[j]))
            }
        }
    }

    return root
}

fun main() {
    val lca = LowestCommonAncestor(buildTree())

    val randomNumber1 = Random.nextInt(0, 100)
    val randomNumber2 = Random.nextInt(0, 100)

    println(lca.findCommonAncestor(randomNumber1, randomNumber2))
}