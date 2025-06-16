import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LowestCommonAncestorTest {
    private fun buildSimpleTree(): TreeNode<Int> {
        val root = TreeNode(1)
        val childA = TreeNode(2, root)
        val childB = TreeNode(3, root)
        val grandchildA = TreeNode(4, childA)
        val grandchildB = TreeNode(5, childA)
        val grandchildC = TreeNode(6, childB)
        root.children.addAll(listOf(childA, childB))
        childA.children.addAll(listOf(grandchildA, grandchildB))
        childB.children.add(grandchildC)
        return root
    }

    @Test
    fun `finds lca for siblings`() {
        val lca = LowestCommonAncestor(buildSimpleTree())
        val ancestor = lca.findCommonAncestor(4, 5)
        assertNotNull(ancestor)
        assertEquals(2, ancestor?.value)
    }

    @Test
    fun `finds lca for cousins`() {
        val lca = LowestCommonAncestor(buildSimpleTree())
        val ancestor = lca.findCommonAncestor(4, 6)
        assertNotNull(ancestor)
        assertEquals(1, ancestor?.value)
    }

    @Test
    fun `finds lca for parent and child`() {
        val lca = LowestCommonAncestor(buildSimpleTree())
        val ancestor = lca.findCommonAncestor(2, 4)
        assertNotNull(ancestor)
        assertEquals(2, ancestor?.value)
    }

    @Test
    fun `returns null if node not found`() {
        val lca = LowestCommonAncestor(buildSimpleTree())
        val ancestor = lca.findCommonAncestor(4, 99)
        assertNull(ancestor)
    }

    @Test
    fun `returns node itself if same node`() {
        val lca = LowestCommonAncestor(buildSimpleTree())
        val ancestor = lca.findCommonAncestor(4, 4)
        assertNotNull(ancestor)
        assertEquals(4, ancestor?.value)
    }
}
