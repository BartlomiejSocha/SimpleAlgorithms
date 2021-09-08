fun main() {
    class Car<T> {
        var doors = 2

        fun printCar1(car: Car<Int>) {
            val isCoupe = car?.let {
                (it.doors <= 2)
            }
            if(isCoupe == true)
                println("Coupe1")
        }

        fun printCar2(car: Car<Int>) {
            val isCoupe = car?.run {
                (this.doors <= 2)
            }
            if (isCoupe == true)
                println("Coupe2")
        }

        fun printCar3(car: Car<Int>) {
            car?.also {
                doors = 4
            }.let {
                if(it.doors != null && doors <= 2) {
                    println("Coupe3")
            }
            }
        }

        fun printCar4(car: Car<Int>) {
            car?.apply {
                doors = 4
            }.let {
                if (it?.doors != null && it.doors <= 2) {
                    println("Coupe4")
                }
            }

        }
    }
/*    val car = Car<Int>()
    car.printCar1(2)
    car.printCar2(2)
    car.printCar3(2)
    car.printCar4(2)*/

}
