class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""

        my_string.forEachIndexed { index, c -> if (index == num1) answer += my_string[num2] else if (index == num2) answer += my_string[num1] else answer += my_string[index] }

        return answer
    }
}