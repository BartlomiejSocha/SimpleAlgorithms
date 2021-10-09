fun main() {
    class Car<T> {
        var doors = 2

        fun printCar1(car: Int) {
            val isCoupe = car?.let {
                (doors <= 2)
            }
            if(isCoupe == true)
                println("Coupe1")
        }

        fun printCar2(car: Int) {
            val isCoupe = car?.run {
                (doors <= 2)
            }
            if (isCoupe == true)
                println("Coupe2")
        }

        fun printCar3(car: Int) {
            car?.also {
                doors = 4
            }.let {
                if(doors != null && doors <= 2) {
                    println("Coupe3")
            }
            }
        }

        fun printCar4(car: Int) {
            car?.apply {
                doors = 4
            }.let {
                if (doors != null && doors <= 2) {
                    println("Coupe4")
                }
            }

        }
    }
    var car = Car<Int>()
    car.printCar1(2)
    car.printCar2(2)
    car.printCar3(2)
    car.printCar4(2)

}
