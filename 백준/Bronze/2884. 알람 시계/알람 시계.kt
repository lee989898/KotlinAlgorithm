import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    var hour = stringTokenizer.nextToken().toInt()
    val minute = stringTokenizer.nextToken().toInt()
    if (hour == 0) hour = 24
    var total = hour * 60 + minute - 45
    val secondTotal = total % 60

    if (total / 60 >= 24) total = 0

    print("${total / 60} $secondTotal")
}
