import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readln().toInt()

    val set = mutableSetOf<String>()

    repeat(num) {
        val name = readln().split(" ")
        set.add(name[0])
        if (name[1] == "leave") {
            set.remove(name[0])
        }
    }

    set.sortedDescending().forEach { bw.write("$it\n") }

    bw.flush()
    bw.close()
    close()
}
