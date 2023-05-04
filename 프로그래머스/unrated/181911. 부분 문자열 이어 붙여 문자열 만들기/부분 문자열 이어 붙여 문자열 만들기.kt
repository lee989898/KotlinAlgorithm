class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer = ""

        for (i in my_strings.indices) {
            answer += my_strings[i].slice(parts[i][0]..parts[i][parts[i].lastIndex])
        }

        return answer
    }
}