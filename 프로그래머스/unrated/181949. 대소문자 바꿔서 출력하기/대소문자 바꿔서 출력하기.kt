fun main(args: Array<String>) {
    val s1 = readLine()!!
    print(s1.map { if (it.isUpperCase()) it.lowercase() else it.uppercase() }.joinToString(""))
}