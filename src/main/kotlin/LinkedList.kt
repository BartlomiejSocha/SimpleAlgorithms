class LinkedList<T> : Iterable<T>, Collection<T>, MutableIterator<T>, MutableCollection<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    override var size = 0


    override fun iterator(): MutableIterator<T> {
        return LinkedListIterator(this)
    }

    override fun isEmpty(): Boolean {
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

    fun pop(): T? {
        if(!isEmpty()) size--
        val result = head?.value
        head = head?.next
        if (isEmpty()) {
            tail = null
        }
        return result
    }

    fun removeLast(): T? {
        //1
        val head = head ?: return null
        //2
        if (head.next == null) return pop()
        //3
        size--
        //4
        var prev = head
        var current = head

        var next = current.next
        while (next != null) {
            prev = current
            current = next
            next = current.next
        }
        //5
        prev.next = null
        tail = prev
        return current.value
    }

    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value

        if (node.next == tail) {
            tail = node
        }

        if (node.next != null) {
            size--
        }

        node.next = node.next?.next
        return result
    }

    override fun contains(element: T): Boolean {
        for(item in this) {
            if (item == element) return true
        }
        return false
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        for (searched in elements) {
            if (!contains(searched)) return false
        }
        return true
    }

    override fun add(element: T): Boolean {
        append(element)
        return true
    }

    override fun addAll(elements: Collection<T>): Boolean {
        for (element in elements) {
            append(element)
        }
        return true
    }

    override fun clear() {
        head = null
        tail = null
        size = 0
    }

    override fun remove(element: T): Boolean {
        //1
        val iterator = iterator()
        //2
        while (iterator.hasNext()) {
            val item = iterator.next()
            //3
            if (item == element) {
                iterator.remove()
                return true
            }
        }
        //4
        return false
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        var result = false
        for (item in elements) {
            result = remove(item) || result
        }
        return result
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        var result = false
        val iterator = this.iterator()
        while (iterator.hasNext()) {
            val item = iterator.next()
            if (!elements.contains(item)) {
                iterator.remove()
                result = true
            }
        }
        return result
    }

}
