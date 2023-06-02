import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Collections

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    val max = list.max().toDouble()

    bw.write("${list.sumOf { it / max * 100 } / num}")
    
    bw.flush()
    bw.close()
    br.close()
}