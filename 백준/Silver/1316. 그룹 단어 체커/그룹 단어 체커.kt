import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var total = 0

    repeat(readln().toInt()) {
        val word = StringTokenizer(readln()).nextToken()
        val list = mutableSetOf<Char>()

        var lastChar = ' '
        var isGroupWard = true
        word.forEach {
            if (lastChar != it) {
                lastChar = it

                if (!list.add(it)) {
                    isGroupWard = false
                }
            }
        }
        if (isGroupWard) {
            total++
        }
    }

    bw.write(total.toString())
    bw.flush()
    bw.close()
    close()
}
