package tree

import tree.node.BSTreeNode

class BSTree<K : Comparable<K>, V> : SearchTree<K, V, BSTreeNode<K, V>> {

    constructor() : super()
    constructor(key: K, value: V) : super(key, value)
    constructor(pairs: Array<Pair<K, V>>) : super(pairs)

    override fun insertNode(node: BSTreeNode<K, V>) {
        var parentNode = root;
        var treeNode = root;
        while (treeNode != null) {
            parentNode = treeNode;
            if (node.key < treeNode.key) {
                treeNode = treeNode.left
            } else {
                treeNode = treeNode.right
            }
        }
        if (parentNode == null) {
            root = node;
        } else if (node.key < parentNode.key) {
            parentNode.left = node;
        } else {
            parentNode.right = node;
        }
    }

    override fun removeNode(node: BSTreeNode<K, V>) {
        TODO("Remove node in tree")
    }

    override fun createNode(key: K, value: V): BSTreeNode<K, V> {
        val node = BSTreeNode(key, value);
        return node;
    }
}