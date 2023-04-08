import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readln().toInt()

    var stringTokenizer: StringTokenizer
    val array2D = Array(100) { Array(100) { 0 } }

    var a: Int
    var b: Int
    var result = 0

    repeat(n) {
        stringTokenizer = StringTokenizer(readln(), " ")
        a = stringTokenizer.nextToken().toInt()
        b = stringTokenizer.nextToken().toInt()

        for (i in a until a + 10) {
            for (j in b until b + 10) {
                array2D[i][j] = 1
            }
        }
    }

    for (i in 0..99) {
        result += array2D[i].count { it == 1}
    }
    bw.write("$result")

    bw.close()
    close()
}