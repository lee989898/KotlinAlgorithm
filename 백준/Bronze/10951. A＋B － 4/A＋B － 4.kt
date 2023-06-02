import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        try {
            val (a, b) = br.readLine().split(" ").map { it.toInt() }
            bw.write("${a + b}\n")
        } catch (e: Exception) {
            break
        }
    }

    bw.flush()
    bw.close()
    br.close()
}