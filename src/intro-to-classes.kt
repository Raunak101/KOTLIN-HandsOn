// Introduction to classes
// There are 2 types of constructors
// 1- primary Constructor- Made only 1, as 1 is only possible
// 2- Secondary Constructor- Can be made many

// We can also use init property to initialise the Primary Constructor
// In Primary Constructor the properties are defined in class () brackets
class User(name: String, numb: Int, var email: String, var gender: String) {

    // Just we need to declare the properties that are inside init
    // We can use either init or the primary bracket one
    var name: String
    var numb: Int

    // Benefit of using the init is we can change the default initialisation values that are coming
    // directly while assigning
    init {
        this.name = name.capitalize()
        this.numb = numb + 100
    }

    // These are called properties
//    var name: String = ""
//    var numb: Int = 1
//    var email: String = ""
//    var gender: String = ""

    // These are called member functions
    fun check(email: String): Boolean {
        return email.isNotEmpty()
    }

    fun update(email: String, numb: Int) {
        this.email = email
        this.numb = numb
    }
}


class Account {
    var accno: Int = 1
    var name: String = " "
    var email: String = " "

    // Secondary Constructor
    constructor(accno: Int) {
        this.accno = accno
    }

    constructor(name: String, email: String) {
        this.name = name
        this.email = email
    }
}

fun main() {
    // object creation
    // Primary Constructor is initialised
    val user: User = User("gmail@", 1, "@gmail", "M")

    // Secondary Constructors are initialised
    val account1: Account = Account(1)
    val account2: Account = Account("Kotlin", "@Kotlin")
    // accessing class variables
    user.email = "Kotlin@"
    user.name = "Kotlin"
    user.gender = "M"
    user.numb = 1

    user.update("@Kotlin.com", 1)

    println(user.check(user.email))
}
