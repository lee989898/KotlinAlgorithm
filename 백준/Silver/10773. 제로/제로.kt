import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val total = readln().toInt()
    val queue: Stack<Int> = Stack()

    repeat(total) {
        val number = readln().toInt()
        if (number == 0) {
            queue.pop()
        } else {
            queue.push(number)
        }
    }

    bw.write("${queue.sum()}")

    bw.flush()
    bw.close()
    close()
}
