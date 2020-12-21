// Kotlin gives us a very unique feature of creating objects even without classes
// Under the hood basically it creates a class for this obj on the JAVA singleton pattern
// Condition is we can only create a single object of this type
// use the Object keyword to create a object
// Inside objects we can also have functions

object obj {
    var name: String = ""
    var no: Int = 1

    fun hy() {
        println("Hy There!")
    }
}

fun main() {
    obj.name = "Kotlin"
    obj.hy()
}