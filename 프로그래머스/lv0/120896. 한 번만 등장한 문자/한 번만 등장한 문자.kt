class Solution {
    fun solution(s: String): String {
        var answer: String = ""

        val alpabet = Array(26) { 0 }

        for(index in s.indices) {
            alpabet[s[index].code - 97]++
        }
        
        for (index in alpabet.indices) {
            if (alpabet[index] == 1) {
                answer += (index + 97).toChar()
            }
        }

        return answer
    }
}