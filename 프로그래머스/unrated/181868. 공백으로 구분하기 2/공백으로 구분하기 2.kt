import java.util.Stack

class Solution {
    fun solution(my_string: String): Array<String> {
        val stack = Stack<String>()
        var string = ""

        var i = 0
        while (i < my_string.length) {
            if (my_string[i] == ' ') {
                i += 1
            } else {
                while (i < my_string.length) {
                    if (my_string[i] == ' ')
                        break
                    string += my_string[i]
                    i += 1
                }
                stack.push(string)
                string = ""
            }

        }

        return stack.toTypedArray()
    }
}