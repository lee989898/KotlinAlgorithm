import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = readln()
        val stack = Stack<Char>()
        var isStack = true

        if (string == ".")
            break

        for (char in string) {
            when (char) {
                '(' -> stack.push('(')
                '[' -> stack.push('[')
                ')' -> if (stack.isNotEmpty() && stack.peek() == '(') {
                    stack.pop()
                } else {
                    isStack = false
                }
                ']' -> if (stack.isNotEmpty() && stack.peek() == '[') {
                    stack.pop()
                } else {
                    isStack = false
                }
            }
        }
        
        if (stack.size == 0 && isStack) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
