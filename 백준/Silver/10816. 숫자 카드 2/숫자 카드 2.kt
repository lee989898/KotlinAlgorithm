import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cards = MutableList(20_000_002) { 0 }
    val sb = StringBuilder()

    readln().toInt()
    readln().split(" ").forEach { cards[it.toInt() + 10_000_000]++ }

    readln().toInt()
    readln().split(" ").forEach { sb.append("${cards[it.toInt() + 10_000_000]} ") }

    bw.write("${sb}")

    bw.flush()
    bw.close()
    close()
}