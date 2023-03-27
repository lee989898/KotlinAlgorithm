import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val firstNum = StringTokenizer(readLine(), " ").nextToken().toInt()
    val secondNum = StringTokenizer(readLine(), " ").nextToken()
    val secondNumList = secondNum.toList()

    for (index in 2 downTo 0) {
        println(firstNum * Character.getNumericValue(secondNumList[index]))
    }
    println(firstNum * secondNum.toInt())
}