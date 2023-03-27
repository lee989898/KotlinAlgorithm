import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val integerA = stringTokenizer.nextToken().toInt()
    val integerB = stringTokenizer.nextToken().toInt()
    val plus = integerA + integerB
    val minus = integerA - integerB
    val mul = integerA * integerB
    val div = integerA / integerB
    val mod = integerA % integerB

    print("$plus\n$minus\n$mul\n$div\n$mod")
}