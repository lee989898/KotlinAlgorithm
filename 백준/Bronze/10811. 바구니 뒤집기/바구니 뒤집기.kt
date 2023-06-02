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
        var (i, j) = br.readLine().split(" ").map { it.toInt() }
        i -= 1
        j -= 1

        while (i < j) {
            val temp = array[i]
            array[i++] = array[j]
            array[j--] = temp
        }
    }

    array.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
    br.close()
}