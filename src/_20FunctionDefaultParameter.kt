
fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Sanas")
    hello("Sanas", "Febriyan")
    hello("Akmal")
    hello("Ardi", "Nugroho")
}