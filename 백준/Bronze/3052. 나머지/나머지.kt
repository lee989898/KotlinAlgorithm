import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Collections

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val set = mutableSetOf<Int>()

    repeat(10) {
        set.add(br.readLine().toInt() % 42)
    }

    bw.write("${set.size}")

    bw.flush()
    bw.close()
    br.close()
}