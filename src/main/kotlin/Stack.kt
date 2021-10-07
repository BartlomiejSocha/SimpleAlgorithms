import javax.swing.text.Element

interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
    fun peek(): Element?

    val count: Int
        get

    val isEmpty: Boolean
        get() = count == 0
}

abstract class ImplementsStack: Stack<Element> {
    private val storage = arrayListOf<Element>()

    override fun toString() = buildString {
        appendln("----top----")
        storage.asReversed().forEach {
            appendln("$it")
        }
        appendln("----------")
    }
    override fun push(element: Element) {
        storage.add(element)
    }
    override fun pop(): Element? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(count - 1)
    }

    override fun peek(): Element? {
        return storage.lastOrNull()
    }

    override val count: Int
        get() = storage.size

    companion object {
        fun <Element> create(items: Iterable<Element>): java.util.Stack<Element> {
            val stack = java.util.Stack<Element>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }
    }

}