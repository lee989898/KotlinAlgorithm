fun main(args: Array<String>) {
    readLine()!!.split(' ').map(String::toInt).let { print("${it[0]} + ${it[1]} = ${it[0] + it[1]}")}
}