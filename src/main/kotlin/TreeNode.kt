data class TreeNode<K>(
    val value: K,
    var parent: TreeNode<K>? = null,
    var children: MutableList<TreeNode<K>> = mutableListOf()
) {
    override fun toString(): String {
        return "TreeNode(value=$value, parent=${parent?.value}, children=${children.map { it.value }})"
    }
}
