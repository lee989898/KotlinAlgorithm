class Solution {
    fun solution(my_string: String): IntArray {
        val answer = IntArray(52)

        my_string.forEach { if (it in 'a'..'z') answer[it - 'a' + 26]++ else answer[it - 'A']++ }

        return answer
    }
}