fun main() {
    "creating and linking nodes" example {
        val elementaryNode1 = ElementaryNode(value = 1)
        val elementaryNode2 = ElementaryNode(value = 2)
        val elementaryNode3 = ElementaryNode(value = 3)

        elementaryNode1.next = elementaryNode2
        elementaryNode2.next = elementaryNode3

        println(elementaryNode1)
    }

    "push" example {
        val list = LinkedList<Int>()
        list.push(3)
            .push(4)
            .push(5)

        println(list)
    }

    "append" example {
        val list = LinkedList<Int>()
        list.append(6)
            .append(7)
            .append(8)

        println(list)
    }

    "nodeAt" example {
        val nodeExample = LinkedList<Int>()
        nodeExample.nodeAt(5)
        println(nodeExample)
    }

    "kotlin data structures" example {
        for(i in 1..3) {
            println(i)
        }
        var x = 10
        do {
            x--
        } while (x > 8)
    }

    "functions" example {
        val functionsExample = LinkedList<Int>()
        functionsExample.functions(5)
        println(functionsExample)
    }

    "creating and linking nodes" example {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        println(node1)
    }

    "pop" example {
        val list = LinkedList<Int>()
        list.push(3)
            .push(2)
            .push(1)

        println("Before popping list: $list")
        val poppedValue = list.pop()
        println("After popping list: $list")
        println("Popped value: $poppedValue")
    }

    "removing the last node" example {
        val list = LinkedList<Int>()
        list.push(3)
            .push(2)
            .push(1)

        println("Before removing last node: $list")
        val removedValue = list.removeLast()

        println("After removing last node: $list")
        println("Removed value: $removedValue")
    }

    "removing a node after a particular node" example {
        val list = LinkedList<Int>()
        list.push(3)
            .push(2)
            .push(1)

        println("Before removing at particular index: $list")
        val index = 1
        val node = list.nodeAt(index - 1)!!
        val removedValue = list.removeAfter(node)

        println("After removing at index $index: $list")
        println("Removed value: $removedValue")
    }

    "printing doubles" example {
        val list = LinkedList<Int>()
        list.push(3)
            .push(2)
            .push(1)
        println(list)

        for (item in list) {
            println("Double: ${item * 2}")
        }
    }

    "removing elements" example {
        val list: MutableCollection<Int> = LinkedList()
        list.add(3)
        list.add(2)
        list.add(1)

        println(list)
        list.remove(1)
        println(list)
    }

    "retaining elements" example {
        val list: MutableCollection<Int> = LinkedList()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)

        println(list)
        list.retainAll(listOf(3, 4, 5))
        println(list)
    }

    "remove all elements" example {
        val list: MutableCollection<Int> = LinkedList()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)

        println(list)
        list.removeAll(listOf(3, 4, 5))
        println(list)
    }
}
