class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty List"
        } else {
            head.toString()
        }
    }

    fun push(value: T): LinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++

        return this
    }

    fun append(value: T): LinkedList<T> {
        if (isEmpty()) {
            push(value)
            return this
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size ++
        return this
    }

    fun nodeAt(index: Int): Node<T>? {
        //1
        var currentNode = head
        var currentIndex = 0

        //2
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }
    fun functions(index: Int): Int {
        fun max(a: Int, b: Int): Int {
            var a = 5
            var b = 3
            return if(a > b) a else b
        }

        fun printMax(c: Int, d: Int): Int {
            val maxValue = max(c, d)
            return (maxValue)
        }
        return printMax(5, 6)
    }
}