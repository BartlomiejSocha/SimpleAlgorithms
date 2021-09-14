fun main() {

    val places = listOf("Paris", "London", "Bucharest")
    val mutablePlaces = mutableListOf("Paris", "London", "Bucharest")

    println(places[0])
    println(places[1])
    println(places[2])

    mutablePlaces.add("Budapest")
    println(mutablePlaces)

    mutablePlaces.add(0, "Kiev")
    println(mutablePlaces)
    println(mutablePlaces.reversed())

    val scores = mutableMapOf("Eric" to 9, "Mark" to 12, "Wayne" to 1)
    println(scores)
    scores["Andrew"] = 0
    println(scores)

/*  The sideEffectList function adds a Joker to it. These kind of side-effects
    are usually the ones generating bugs. Avoiding them by using a List
    instead of a MutableList is preferred.

    fun noSideEffectList(names: List<String>) {
        println(names)
    }

    fun sideEffectList(names: MutableList<String>) {
        names.add("Joker")
    }

    val people = mutableListOf("Brian", "Stanley", "Ringo")
    noSideEffectList(people)
    sideEffectList(people)
    noSideEffectList(people)*/

    fun multiplcationBoard(size: Int) {
        for (number in 1..size) {
            print(" | ")
            for(otherNumber in 1..size) {
                print("$number x $otherNumber = ${number * otherNumber} | ")
            }
            println()
        }
    }
    multiplcationBoard(3)

    val numbers = listOf(1, 3, 56, 66, 68, 80, 99, 105, 450)

    fun linearContains(value: Int, numbers: List<Int>): Boolean {
        for (element in numbers) {
            if (element == value) {
                println("true")
                return true
            }
        }
        return false
    }
    linearContains(3, numbers)

    fun pseudeBinaryContains(value: Int, numbers: List<Int>): Boolean {
        if (numbers.isEmpty()) {
            println("false empty")
            return false
        }

        val middleIndex = numbers.size / 2

        if (value <= numbers[middleIndex]) {
            for (index in 0..middleIndex) {
                if (numbers[index] == value) {
                    println("$value | true")
                    return true
                }
            }
        } else {
            for (index in middleIndex until numbers.size) {
                if (numbers[index] == value) {
                    println("$index | true2")
                    return true
                }
            }
        }
        println("false else")
        return false
    }
    pseudeBinaryContains(505, numbers)

    //TIME COMPLEXITY
    fun sumFromOne1(n: Int): Int {
        return (1..n).reduce { sum, element -> sum + element }
    }
    fun sumFromOne2(n: Int): Int {
        return n * (n + 1) / 2
    }
    println(sumFromOne1(20))
    println(sumFromOne2(20))

    val numbersNotSorted = listOf(5, 15, 6, 5, 25, 1, 45, 35, 32, 23, 150, 120)

    //SPACE COMPLEXITY
    fun printSorted(numbers: List<Int>) {
        val sorted = numbers.sorted()
        for (element in sorted) {
            println(element)
        }
    }
    printSorted(numbersNotSorted)

    fun printSortedLong(numbers: List<Int>) {
        //1
        if (numbers.isEmpty()) return

        //2
        var currentCount = 0
        var minValue = Int.MIN_VALUE

        //3
        for(value in numbers) {
            if (value == minValue) {
                println(value)
                currentCount += 1
            }
        }

        while (currentCount < numbers.size) {
            //4
            var currentValue = numbers.maxOrNull()!!

            for (value in numbers) {
                if (value < currentValue && value > minValue) {
                    currentValue = value
                }
            }
            //5
            for (value in numbers) {
                if (value == currentValue) {
                    println(value)
                    currentCount += 1
                }
            }

            //6
            minValue = currentValue
        }
    }
    printSortedLong(numbersNotSorted)
}
