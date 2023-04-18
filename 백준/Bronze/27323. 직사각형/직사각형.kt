import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val A = readln().toInt()
    val B = readln().toInt()

    bw.write("${A * B}")

    bw.flush()
    bw.close()
    close()
}
