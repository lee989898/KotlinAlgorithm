import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf(1,1,2,2,2,8)

    val stringTokenizer = StringTokenizer(readln(), " ")

    for (index in 0..5) {
        list[index] -= stringTokenizer.nextToken().toInt()
    }

    list.forEach { bw.write("$it ") }

    bw.close()
    close()
}