import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var stringTokenizer = StringTokenizer(readLine(), " ")
    val cardNum = stringTokenizer.nextToken().toInt()
    val blackjack = stringTokenizer.nextToken().toInt()

    val cards = IntArray(cardNum)
    var result = 0

    stringTokenizer = StringTokenizer(readLine(), " ")
    for (i in 0 until cardNum) {
        cards[i] = requireNotNull(stringTokenizer.nextToken().toInt())
    }

    for (i in 0 until cardNum - 2) {
        for (j in i + 1 until cardNum - 1) {
            for (k in j + 1 until cardNum) {
                val sum = cards[i] + cards[j] + cards[k]
                if (sum in (result + 1)..blackjack) {
                    result = sum
                }
            }
        }
    }

    print(result)
}