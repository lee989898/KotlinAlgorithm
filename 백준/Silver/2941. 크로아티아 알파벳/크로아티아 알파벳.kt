import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = readln()

    val newWord = word
        .replace("c=", "1")
        .replace("c-", "1")
        .replace("dz=", "1")
        .replace("d-", "1")
        .replace("lj", "1")
        .replace("nj", "1")
        .replace("s=", "1")
        .replace("z=", "1")

    bw.write(newWord.length.toString())
    bw.flush()
    bw.close()
    close()
}
