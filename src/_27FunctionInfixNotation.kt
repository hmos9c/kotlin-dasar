infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Sanas Febriyan" to "LO"
    println(result)

    100 downTo 1
}