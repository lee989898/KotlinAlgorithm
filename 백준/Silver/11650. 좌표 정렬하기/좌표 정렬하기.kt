import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var stringTokenizer = StringTokenizer(readln())
    val num = stringTokenizer.nextToken().toInt()
    val pair = mutableListOf<Pair<Int, Int>>()
    repeat(num) {
        stringTokenizer = StringTokenizer(readln(), " ")
        pair.add(Pair(stringTokenizer.nextToken().toInt(),stringTokenizer.nextToken().toInt()))
    }
    val sortPair = pair.sortedWith(compareBy({it.first}, {it.second}))
    sortPair.forEach { println("${it.first} ${it.second}") }
}