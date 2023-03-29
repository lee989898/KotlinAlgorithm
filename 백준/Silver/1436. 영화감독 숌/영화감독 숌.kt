import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var order = StringTokenizer(readLine(), " ").nextToken().toInt()
    var result = 665

    while (order != 0) {
        result++
        var count = 0
        var tmp = result

        while (tmp > 0) {
            if (tmp % 10 == 6) {
                count++
            } else {
                count = 0
            }

            tmp /= 10

            if (count == 3) {
                order--
            }
        }
    }
    println(result)
}