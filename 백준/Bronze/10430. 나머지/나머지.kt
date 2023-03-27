import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val a = stringTokenizer.nextToken().toInt()
    val b = stringTokenizer.nextToken().toInt()
    val c = stringTokenizer.nextToken().toInt()
    val firstResult = (a + b) % c
    val secondResult = ((a % c) + (b % c)) % c
    val thirdResult = (a * b) % c
    val fourthResult = ((a % c) * (b % c)) % c

    println("$firstResult\n$secondResult\n$thirdResult\n$fourthResult")
}