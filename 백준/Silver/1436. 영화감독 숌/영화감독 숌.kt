import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val order = StringTokenizer(readLine(), " ").nextToken().toInt()
    var result = 0
    var num = 0
    var count = 0
    while (true) {
        if (num.toString().contains("666")) {
            count++
            if (count == order) {
                result = num
                break
            }
        }
        num++
    }
    println(result)
}