class ElementaryNode<T>(var value: T, var next: ElementaryNode<T>? = null) {
    override fun toString(): String {
        return if(next != null) {
            "$value -> ${next.toString()}"
        } else
            "$value"
    }

}