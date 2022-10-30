fun main() {

    val names: Array<String> = arrayOf("Sanas", "Ardi", "Akmal")
    // names.set(0, "Balqis")
    names[0] = "Balqis"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Sanas"
    members[1] = "Sanas"
    members[2] = "Sanas"
    members[3] = null
    members[4] = "Sanas"
    println(members.size)

}