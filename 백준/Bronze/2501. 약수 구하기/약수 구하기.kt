import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val stringTokenizer = StringTokenizer(readln(), " ")
    val N = stringTokenizer.nextToken().toInt()
    val K = stringTokenizer.nextToken().toInt()
    var count = 0
    var result = 0

    for (index in 1..N) {
        if (N % index == 0) {
            count++
            if (count == K) {
                result = index
                break
            }
        }
    }

    println(result)
}