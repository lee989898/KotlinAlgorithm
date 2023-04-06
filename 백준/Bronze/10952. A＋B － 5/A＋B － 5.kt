import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val stringTokenizer = StringTokenizer(readln(), " ")
        val num1 = stringTokenizer.nextToken().toInt()
        val num2 = stringTokenizer.nextToken().toInt()
        if (num1 == 0 && num2 == 0)
            break
        bw.write((num1 + num2).toString() + "\n")
    }

    bw.flush()
    bw.close()
}
