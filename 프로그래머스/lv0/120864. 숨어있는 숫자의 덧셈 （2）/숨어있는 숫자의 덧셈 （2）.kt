import java.util.Stack

class Solution {
    fun solution(my_string: String): Int {
        var index = 0
        var string = ""
        val stack = Stack<String>()

        while (index < my_string.length) {
            if (!my_string[index].isDigit()) {
                index += 1
            } else {
                while (index < my_string.length) {
                    if (!my_string[index].isDigit())
                        break
                    string += my_string[index]
                    index += 1
                }
                stack.push(string)
                string = ""
            }
        }

        return stack.sumOf { it.toInt() }
    }
}