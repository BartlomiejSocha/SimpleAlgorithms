fun main() {

    class Car<T> {
        var doors = false

        fun printCar1(car: T?) {
            val isCoupe = car?.let {
                (it.doors == 2)
            }
            if(isCoupe == true)
                println("Coupe1")
        }

        fun printCar2(car: T?) {
            val isCoupe = car?.run {
                (doors == 2)
            }
            if (isCoupe == true)
                println("Coupe2")
        }

        fun printCar3(car: T?) {
            car?.also {
                doors = 4
            }.let {
                if(it?)
            }
        }
    }
    val car = Car<Int>()
    car.printCar1(1)
    car.printCar2(1)

}
