package Chapter5

import LinkedList

class LinkedListQueue<T> : Queue<T> {

    private val list = LinkedList<T>()

    private var size = 0

    override val count: Int
        get() = size

    override fun enqueue(element: T): Boolean {
        list.append(element)
        size++
        return true
    }

    override fun dequeue(): Boolean {
        val firstNode = list.first ?: return null
        size--
        return list.remove(firstNode)
    }
}