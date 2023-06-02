import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (N, M) = br.readLine().split(" ").map { it.toInt() }

    val array = Array(N) { 0 }

    repeat(M) {
        val (i, j, k) = br.readLine().split(" ").map { it.toInt() }
        for (index in i..j) {
            array[index - 1] = k
        }
    }

    array.forEach { bw.write("${it} ") }

    bw.flush()
    bw.close()
    br.close()
}