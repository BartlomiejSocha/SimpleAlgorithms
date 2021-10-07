import java.util.Stack

class StackImpl {
    companion object {
        fun <Element> create(items: Iterable<Element>): Stack<Element> {
            val stack = Stack<Element>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }
    }
}