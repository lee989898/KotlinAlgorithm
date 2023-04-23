import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<Pair<Int, String>>()

    repeat(readln().toInt()) {
        val stringTokenizer = StringTokenizer(readln(), " ")
        list.add(Pair(stringTokenizer.nextToken().toInt(), stringTokenizer.nextToken()))
    }

    list.sortedWith(compareBy { it.first }).forEach { println("${it.first} ${it.second}") }

    bw.flush()
    bw.close()
    close()
}
