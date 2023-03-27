import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val year = stringTokenizer.nextToken().toInt()

    when {
        (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 -> print(1)
        else -> print(0)
    }
}
