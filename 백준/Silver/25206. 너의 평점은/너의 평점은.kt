import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var sum = 0.0
    var total = 0.0

    repeat(20) {
        val stringTokenizer = StringTokenizer(readln(), " ")
        val subject = stringTokenizer.nextToken()
        val grade = stringTokenizer.nextToken().toDouble()
        val rank = stringTokenizer.nextToken()
        val rankResult = when (rank) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            else -> 0.0
        }
        if (rank != "P") {
            total += grade
            sum += grade * rankResult
        }
    }

    print(sum / total)
}