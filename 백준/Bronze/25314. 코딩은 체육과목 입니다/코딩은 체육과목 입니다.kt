import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = StringTokenizer(readln()).nextToken().toInt()

    repeat(num / 4) {
        bw.write("long ")
    }
    bw.write("int")


    bw.flush()
    bw.close()
    close()
}
