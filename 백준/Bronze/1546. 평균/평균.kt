import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nums = mutableListOf<Double>()
    val count = readln().toInt()
    val stringTokenizer = StringTokenizer(readln(), " ")

    while (stringTokenizer.hasMoreTokens()) {
        nums.add(stringTokenizer.nextToken().toDouble())
    }

    val M = nums.max()
    val numss = nums.map { it / M * 100 }

    bw.write("${numss.average()}")

    bw.flush()
    bw.close()
    close()
}
