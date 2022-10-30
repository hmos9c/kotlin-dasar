fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Sanas", "Febriyan")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Sanas"))

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Sanas Febriyan"))
}