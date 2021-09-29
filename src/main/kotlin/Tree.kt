fun main() {
/*    val hot = TreeNode("Hot")
    val cold = TreeNode("Cold")
    val beverages = TreeNode("Beverages").run {
        add(hot)
        add(cold)
    }*/

    val tree = TreeNode("Beverages").run {
        makeBeverageTree()
    }
        tree.forEachDepthFirst {
            println(it.value)
        }
}