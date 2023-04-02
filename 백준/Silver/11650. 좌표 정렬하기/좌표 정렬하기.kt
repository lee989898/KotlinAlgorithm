import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

data class Point(val x: Int, val y: Int)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var stringTokenizer = StringTokenizer(readln())
    val num = stringTokenizer.nextToken().toInt()
    val points = mutableListOf<Point>()
    repeat(num) {
        stringTokenizer = StringTokenizer(readln(), " ")
        points.add(Point(stringTokenizer.nextToken().toInt(), stringTokenizer.nextToken().toInt()))
    }
    val sortPair = points.sortedWith(compareBy({ it.x }, { it.y }))
    sortPair.forEach { println("${it.x} ${it.y}") }
}
