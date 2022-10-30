fun main() {

    var firstName: String = "Sanas"
    var lastName: String = "Febriyan"

    var address: String = """
        >Jalan belum jadi, RT 02 RW 11,
        >Kabupaten Bogor,
        >Jawa barat,
        >Indonesia
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}