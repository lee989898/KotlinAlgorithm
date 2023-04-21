import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readln().toInt()
    val sb = StringBuffer()
    val stack = Stack<Int>()
    var cur = 1

    for(i in 0 until n) {
        val cmd = readln().toInt()
        while (cur <= cmd) {
            stack.push(cur)
            cur++
            sb.append("+\n")
        }
        if (stack.peek() == cmd) {
            stack.pop()
            sb.append("-\n")
        } else {
            println("NO")
            return@with
        }
    }

    bw.write("$sb")
    
    bw.flush()
    bw.close()
    close()
}
