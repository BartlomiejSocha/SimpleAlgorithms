infix fun Any.example(function: () -> Unit) {
    println("---Example of $this---")
    function()
    println()
}
