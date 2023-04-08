import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readln().toInt()

    repeat(num) {
        val stringTokenizer = StringTokenizer(readln(), " ")
        val count = stringTokenizer.nextToken().toInt()
        val word = stringTokenizer.nextToken()

        bw.write(word.map { it.toString().repeat(count) }.joinToString("") + "\n")
    }

    bw.flush()
    bw.close()
    close()
}
