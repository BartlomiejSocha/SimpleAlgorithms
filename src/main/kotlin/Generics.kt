fun main() {

    class Box<T> {
        var content: T? = null

        fun put(content: T?) {
            this.content = content
        }
        fun retrieve(): T? {
            return content
        }
        fun isEmpty(): Boolean {
            return content == null
        }
    }

    val box = Box<Int>()
    box.put(4)

    val boolBox = Box<Boolean>()
    boolBox.put(true)
    boolBox.isEmpty()

}
