import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var word = readln()

    val croatiaWords = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    for (croatiaWord in croatiaWords) {
        word = word.replace(croatiaWord, "1")
    }
    
    bw.write(word.length.toString())
    bw.flush()
    bw.close()
    close()
}
