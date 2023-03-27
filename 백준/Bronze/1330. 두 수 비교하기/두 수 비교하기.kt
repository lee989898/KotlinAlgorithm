import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val firstNum = stringTokenizer.nextToken().toInt()
    val secondNum = stringTokenizer.nextToken().toInt()

    when {
        firstNum < secondNum -> print("<")
        firstNum > secondNum -> print(">")
        else -> print("==")
    }
}