import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val integerA = stringTokenizer.nextToken().toInt()
    val integerB = stringTokenizer.nextToken().toInt()
    val sum = integerA - integerB

    print(sum)
}