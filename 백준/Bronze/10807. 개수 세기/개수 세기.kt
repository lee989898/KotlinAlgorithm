import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = StringTokenizer(readln()).nextToken().toInt()

    val integers = mutableListOf<Int>()

    val integer = StringTokenizer(readln(), " ")

    while (integer.hasMoreTokens()) {
        integers.add(integer.nextToken().toInt())
    }

    val findNum = StringTokenizer(readln()).nextToken().toInt()

    bw.write("${integers.count { it == findNum }}")

    bw.flush()
    bw.close()
    close()
}
