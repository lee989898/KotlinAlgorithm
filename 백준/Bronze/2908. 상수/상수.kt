import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stringTokenizer = StringTokenizer(readln(), " ")
    val num1 = stringTokenizer.nextToken().reversed()
    val num2 = stringTokenizer.nextToken().reversed()

    if (num1 > num2)
        bw.write(num1)
    else
        bw.write(num2)

    bw.flush()
    bw.close()
    close()
}