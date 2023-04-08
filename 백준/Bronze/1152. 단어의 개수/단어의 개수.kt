import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stringTokenizer = StringTokenizer(readln(), " ")
    val words = mutableListOf<String>()

    while (stringTokenizer.hasMoreTokens()) {
        val word = stringTokenizer.nextToken()
        if (word.isNotBlank()) {
            words.add(word)
        }
    }

    bw.write("${words.size}")

    bw.flush()
    bw.close()
    close()
}
