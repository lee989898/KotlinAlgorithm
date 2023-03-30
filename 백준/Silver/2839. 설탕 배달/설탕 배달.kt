import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    var sugar = stringTokenizer.nextToken().toInt()
    var num = 0

    while (true) {
        if (sugar % 5 == 0) {
            print("${sugar / 5 + num}")
            break
        } else if (sugar <= 0) {
            print(-1)
            break
        }
        sugar -= 3
        num++
    }
}