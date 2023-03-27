import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val num = stringTokenizer.nextToken().toInt()
    var result = 0
    var sum = 0

    for (element in 1..num) {
        sum = digitSum(element)
        if (sum + element == num) {
            result = element
            break
        }
    }
    println(result)
}

fun digitSum(n: Int): Int {
    var sum = 0
    var i = n
    while (i > 0) {
        sum += i % 10
        i /= 10
    }
    return sum
}