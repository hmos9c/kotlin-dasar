fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Sanas", lambdaUpper))

    println(hello("Sanas", { value: String -> value.toLowerCase() }))

    val result1 = hello("Sanas", { value: String -> value.toLowerCase() })
    val result2 = hello("Sanas") { value: String ->
        value.toLowerCase()
    }
}