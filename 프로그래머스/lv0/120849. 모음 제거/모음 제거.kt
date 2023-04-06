class Solution {
    fun solution(my_string: String): String {
        var answer: String = my_string
        val words = listOf("a", "e", "i", "o", "u")
        for(word in words) {
           answer = answer.replace(word, "")
        }
        return answer
    }
}