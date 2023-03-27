import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var stringTokenizer = StringTokenizer(readLine(), " ")
    val hour = stringTokenizer.nextToken().toInt()
    val minute = stringTokenizer.nextToken().toInt()
    stringTokenizer = StringTokenizer(readLine(), " ")
    val finishMinute = stringTokenizer.nextToken().toInt()

    val result = hour * 60 + minute + finishMinute

    val hourResult = if (result / 60 >= 24) result / 60 - 24 else result / 60

    print("$hourResult ${result % 60}")
}
