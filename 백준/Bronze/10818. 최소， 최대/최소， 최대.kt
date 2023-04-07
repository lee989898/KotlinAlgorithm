import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = StringTokenizer(readln()).nextToken().toInt()
    val nums = mutableListOf<Int>()

    val num = StringTokenizer(readln(), " ")
    while (num.hasMoreTokens()) {
        nums.add(num.nextToken().toInt())
    }

    bw.write("${nums.min()} ${nums.max()}")


    bw.flush()
    bw.close()
    close()
}
