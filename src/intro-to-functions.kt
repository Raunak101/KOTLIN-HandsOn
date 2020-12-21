// Functions should be named using lower CamelCasing
// If its returning nothing we don't write void here

// After the (): we write the return type of function except being VOID
// Type-1
fun getName(): String {
    return "KOTLIN"
}

// inside the () we write the parameters of the function, i.e. the arguments it will take
// Type-2
fun square(number: Int): Int {
    return number * number
}

// functions in KOTLIN can also work as expressions
// Type-3
fun square2(number: Int) = number * number

fun main() {
    val s = getName()
    println(s)

    val a = square(5)
    println(a)

    println(square2(4))
    // Positional Arguments, i.e position of passing the values is fixed
    check("KOTLIN", 20, 30)

    // Default Arguments Function Call, i.e some values are given inside definition by default
    check2("KOTLIN", 20)

    // Named Arguments Function Call, i.e we pass values to the arguments
    // by naming the value to there respective argument
    check3(age = 20, name = "KOTLIN", numb = 5)
    // Types of Arguments in a Function
    // 1- Positional Arguments
    // 2- Default Arguments
    // 3- Named Arguments

    // In call of a vararg function tho it has only one argument needed but its a vararg type ,
    // so we can pass a variety of arguments to it
    // and it will accept all of them
    // it is basically used in scenarios when its not confirm about the quantity of data
    varar(1, 2, 3, 4, 5, 6, 7, 8, 9)
}

// Positional Arguments
fun check(name: String, age: Int, numb: Int) {
    println("Name is $name & age is $age ")
}

// Default Arguments
fun check2(name: String, age: Int, numb: Int = 50) {
    println("Default Argument function")
}

// Named Arguments
fun check3(name: String, age: Int, numb: Int) {
    println("This is a Named arguments function")
}

// Vararg Function
fun varar(vararg numb: Int) {
    println(numb.size)
    for (no in numb)
        println(no)
}