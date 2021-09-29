import javax.swing.text.Element

interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
}

class ImplementsStack: Stack<Element> {
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
        if (storage.size == 0) {
            return null
        }
        return storage.removeAt(storage.size - 1)
    }
}