import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var stringTokenizer = StringTokenizer(readln(), " ")

    val n = stringTokenizer.nextToken().toInt()
    val m = stringTokenizer.nextToken().toInt()

    val array2D = Array(n) { IntArray(m) { 0 } }

    repeat(2) {
        for (i in 0 until n) {
            stringTokenizer = StringTokenizer(readln(), " ")
            for (j in 0 until m) {
                array2D[i][j] += stringTokenizer.nextToken().toInt()
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            bw.write("${array2D[i][j]} ")
        }
        bw.write("\n")
    }

    bw.close()
    close()
}