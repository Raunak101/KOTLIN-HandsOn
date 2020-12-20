lateinit var g: String

//Late-init means Late Initialisation
//It gives ability to the var to be initialised at some later point of time

var h: Int? = null

//KOTLIN has a unique safety feature called Null Safety
// ? depicts that this value can be nullable

var i: String? = null
fun main() {

    //variable declaration in KOTLIN
    //Both var & val should be initialised at the time of declaration
    //val cannot be reassigned
    val a = 10
    // a = 5 Not allowed
    val b = "Hello From Kotlin !"
    val c = false
    val d = 10.0f
    val e = 10.0
    //var can be reassigned
    var f = "Hi There !"
    f = "Hows ur Day?"          //Permitted
    g = "Android"
    h = 5
    i = "Bugs"
    val size: Int = i?.length ?: 0
    // ?: is known as an Elvis Operator
    //if i is null then it will be set to right side value i.e. 0
    //if i is not null it will be set to the value that it has got
    println("Hello World!")
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(size)
    // $ is used for string concatenation
    println("This is an Android $i")
    println("Length of bug is ${i!!.length}")
    println("Hello from "+ g)
}