fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName$lastName")
}

fun main() {
    fullName("Sanas", "Feb", "riyan")
    fullName(
        lastName = "riyan",
        firstName = "Sanas",
        middleName = "Feb"
    )
}