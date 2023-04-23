import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val set = mutableSetOf<String>()

    repeat(readln().toInt()) {
        set.add(readln())
    }

    set.sortedBy { it }.sortedBy { it.length }.forEach {bw.write("$it\n")}

    bw.flush()
    bw.close()
    close()
}
