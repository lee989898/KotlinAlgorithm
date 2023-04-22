import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readln().toInt()
    val queue: Deque<Int> = LinkedList()

    (1..num).forEach { queue.add(it) }

    while (queue.size != 1) {
        queue.pollFirst()
        queue.addLast(queue.peekFirst())
        queue.pollFirst()
    }

    bw.write("${queue.peek()}")
    
    bw.flush()
    bw.close()
    close()
}
