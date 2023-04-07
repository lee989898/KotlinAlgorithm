import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var stringTokenizer: StringTokenizer
    var total = StringTokenizer(readln()).nextToken().toInt()
    val num = StringTokenizer(readln()).nextToken().toInt()

    repeat(num) {
        stringTokenizer = StringTokenizer(readln(), " ")
        val bill = stringTokenizer.nextToken().toInt()
        val count = stringTokenizer.nextToken().toInt()
        total -= bill * count
    }

    if (total == 0) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.flush()
    bw.close()
    close()
}
