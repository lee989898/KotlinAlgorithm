import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val num = stringTokenizer.nextToken().toInt()
    var result = 0

    for (element in 1..num) {
        var i = element
        var sum = 0
         while (i > 0) {
             sum += i % 10
             i /= 10
         }
        if (sum + element == num) {
            result += element
            break
        }
    }

    print(result)
}
