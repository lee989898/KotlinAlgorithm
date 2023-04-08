import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = readln()
    var total = 0

    for (index in word.indices) {
        total += when (word[index]) {
            in 'A'..'C' -> 3
            in 'D'..'F' -> 4
            in 'G'..'I' -> 5
            in 'J'..'L' -> 6
            in 'M'..'O' -> 7
            in 'P'..'S' -> 8
            in 'T'..'V' -> 9
            else -> 10
        }
    }

    bw.write("$total")

    bw.flush()
    bw.close()
    close()
}