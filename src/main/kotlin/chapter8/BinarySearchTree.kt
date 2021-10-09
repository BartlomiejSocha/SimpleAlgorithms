package chapter8

import chapter7.BinaryNode

class BinarySearchTree<T: Comparable<T>>() {

    var root: BinaryNode<T>? = null

    override fun toString() = root?.toString() ?: "empty tree"

    fun insert(value: T) {
        root = insert(this.root, value)
    }

    private fun insert(
        node: BinaryNode<T>?,
        value: T
    ): BinaryNode<T> {
        //1
        node ?: return BinaryNode(value)
        //2
        if (value < node.value) {
            node.leftChild = insert(node.leftChild, value)
        } else {
            node.rightChild = insert(node.rightChild, value)
        }
        //3
        return node
    }
}
