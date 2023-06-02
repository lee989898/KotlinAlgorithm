import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Collections

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (N, M) = br.readLine().split(" ").map { it.toInt() }

    val array = Array(N) { it + 1 }

    repeat(M) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        array[i - 1] = array[j - 1].also { array[j - 1] = array[i - 1] }
    }

    array.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
    br.close()
}