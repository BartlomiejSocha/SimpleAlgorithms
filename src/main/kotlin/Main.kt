fun main() {
    "creating and linkings nodes" example {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        println(node1)
    }

    "push" example {
        val list = LinkedList<Int>()
        list.push(3).push(4).push(5)

        println(list)
    }

    "append" example {
        val list = LinkedList<Int>()
        list.append(6).append(7).append(8)

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
}
