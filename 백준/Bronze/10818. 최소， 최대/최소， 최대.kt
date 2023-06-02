import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    bw.write("${list.min()} ${list.max()}")

    bw.flush()
    bw.close()
    br.close()
}