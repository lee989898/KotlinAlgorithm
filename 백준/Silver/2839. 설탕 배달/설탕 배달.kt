import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val sugar = stringTokenizer.nextToken().toInt()
    var numBag = 0
    var remainingSugar = sugar

    while (true) {
        if (remainingSugar % 5 == 0) {
            print("${remainingSugar / 5 + numBag}")
            break
        } else if (remainingSugar <= 0) {
            print(-1)
            break
        }
        remainingSugar -= 3
        numBag++
    }
}