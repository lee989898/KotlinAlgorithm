import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var s: String?

    while (readLine().also { s = it } != null) {
        val stringTokenizer = StringTokenizer(s)
        val num1 = stringTokenizer.nextToken().toInt()
        val num2 = stringTokenizer.nextToken().toInt()
        bw.write((num1 + num2).toString() + "\n")
    }
 
    bw.flush()
    bw.close()
    close()
}
