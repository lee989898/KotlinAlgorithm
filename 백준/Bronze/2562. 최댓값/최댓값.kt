import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(9) { 0 }

    repeat(9) {
        array[it] = br.readLine().toInt()
    }

    val max = array.max()

    bw.write("${max}\n${array.indexOf(max) + 1}")

    bw.flush()
    bw.close()
    br.close()
}