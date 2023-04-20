import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val total = readln().toInt()

    repeat(total) {
        var count = 0
        val ps = readln()
        var isPs = true
        for (char in ps) {
            if (char == '(') {
                count++
            } else {
                if (count > 0) {
                    count--
                } else {
                    isPs = false
                    break
                }
            }
        }

        if (isPs && count == 0) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }

    }

    bw.flush()
    bw.close()
    close()
}
