import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.reversed() }

    if (a > b) {
        bw.write(a)
    } else {
        bw.write(b)
    }

    bw.flush()
    bw.close()
    br.close()
}