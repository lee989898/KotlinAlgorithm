class Solution {
    fun solution(s: String): String {
        var index = 0
        var answer = s.map {
            if (it == ' ') {
                index = 0
                it
            } else if (index % 2 == 0) {
                index++
                it.uppercase()
            } else {
                index++
                it.lowercase()
            }
        }.joinToString("")

        return answer
    }
}
