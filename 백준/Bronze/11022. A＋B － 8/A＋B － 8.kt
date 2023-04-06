import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var stringTokenizer = StringTokenizer(readln())
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var num = 1

    repeat(stringTokenizer.nextToken().toInt()) {
        stringTokenizer = StringTokenizer(readln(), " ")
        val num1 = stringTokenizer.nextToken().toInt()
        val num2 = stringTokenizer.nextToken().toInt()
        bw.write("Case #${num++}: $num1 + $num2 = " + (num1 + num2).toString() + "\n")
    }
    bw.flush()
    bw.close()
}
