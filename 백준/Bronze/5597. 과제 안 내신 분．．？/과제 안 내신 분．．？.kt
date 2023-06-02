import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Collections

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(30) { 0 }

    repeat(28) {
        array[br.readLine().toInt() - 1]++
    }

    array.forEachIndexed { index, i -> if (i == 0) println(index + 1) }

    bw.flush()
    bw.close()
    br.close()
}