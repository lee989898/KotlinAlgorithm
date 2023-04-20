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
            if (char == '(')
                stack.push('(')
            else if (char == '[')
                stack.push('[')

            if (stack.isNotEmpty() && char == ')' && stack.peek() == '(') {
                stack.pop()
            } else if (stack.isNotEmpty() && char == ']' && stack.peek() == '[') {
                stack.pop()
            } else if (char == ')') {
                isStack = false
            } else if (char == ']') {
                isStack = false
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
