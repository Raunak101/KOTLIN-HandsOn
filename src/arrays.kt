// Declaration of Array
// It works on vararg
// vararg simply means there can be n number of arguments inside a function

// Type-1
val numbers = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7)     // We have specified the type to Integer
val mixed = arrayOf("KOTLIN", "Flutter", "JAVA", 4, 5, 6, 7)    // Valid as we haven't given any type
val names =
    arrayOf<String>("KOTLIN", "Flutter", "JAVA", "React Native", "Xamarin")  // We have specified the type to String
var blank = arrayOf<String>()   // This can be initialised later also

// Array is a Class in Kotlin , So we ca create constructor for it.
// Constructor needs two arguments size of array & the initialisation
// Type-2
val num = Array(7) { i -> i * 2 }

// intArrayof is used when it is known beforehand that type of array is Int
// Type-3
val numArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)

// This will set Array of Nulls of size 5
val nullArray = arrayOfNulls<String>(5)

fun main() {
    // Initialisation
//    blank[1] = "KOTLIN"
    numbers[0] = 0
    println("Hello world!!")
    println("numbers Array " + numbers[0])
    println("mixed Array " + mixed[0])
    println("names Array " + names[0])
    println("num Array " + num[5])
    println("numArray Array " + numArray[6])
    // println("blank Array " + blank[0])
}