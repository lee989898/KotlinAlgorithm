import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = readln()
    val alphabet = MutableList(26) { -1 }

    for (index in word.indices) {
        if (alphabet[word[index] - 'a'] == -1) {
            alphabet[word[index] - 'a'] = index
        }
    }

    alphabet.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
    close()
}
