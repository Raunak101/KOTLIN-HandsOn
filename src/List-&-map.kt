// List is immutable
// that is we cannot alter after creation
// Type-1
var listofNames = listOf<String>("JAVA", "KOTLIN", "FLUTTER", "React-Native")

// To make a Mutable List
// 2 options mutablelistof & arrayListof
// Type-2
var mutablelistofNames = mutableListOf<String>()

// Type-3
var mutableArraylistof = arrayListOf<String>()

// Maps can also be used
var mapofNames = mapOf<Int, String>(0 to "Kotlin", 1 to "Java", 2 to "Flutter", 3 to "React-Native")
var mapofstring = mapOf<String, String>("name" to "Kotlin", "course" to "Android", "IDE" to "IntelliJ")

// HashMap is Mutable
var hashmapofnames = hashMapOf("name" to "Kotlin", "course" to "Android")

fun main() {

    println("Hello World")
    println(mapofNames[0])
    println(mapofstring["name"])
    hashmapofnames["support"] = "Google"
    mutablelistofNames.add("Kotlin")
    mutablelistofNames.add("android")
    println(hashmapofnames["support"])
    println(mutablelistofNames[0])
    println(mutablelistofNames[1])

    // For-Each Loop
    hashmapofnames.forEach { it1, it2 ->
        println(it1 + " " + it2)
    }

    listofNames.forEach {
        it
        println(it)
    }

    // Traditional For Loop
    for (x in 0..10) {
        println(x)
    }

    // until leaves the upper bound
    for (x in 0 until 10) {
        println(x)
    }

    // step gives the increment
    for (x in 0 until 10 step 2) {
        println(x)
    }

    // down to is used for backward loop
    for (x in 10 downTo 0 step 2) {
        println(x)
    }

    // as is a keyword which is used for casting of a val/var to any data type
    // Any shows that it can be of any type
    val any1: Any = "Kotlin"
    any1 as String
    val s: String = any1
    println("Any1 " + s)

    val any2: Any = 2
    any2 as Int
    val x: Int = any2
    println("Any2 " + x)

    val any3: Any = "Java"
    // is Is used to put a check for type
    if (any3 is String) {
        println("Yes any3 is String " + any3.length)
    }
}