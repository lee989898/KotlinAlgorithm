import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val string = StringTokenizer(readln()).nextToken().toString()
    val num = StringTokenizer(readln()).nextToken().toInt()

    print(string[num-1])
}
