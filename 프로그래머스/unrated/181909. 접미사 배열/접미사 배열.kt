class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        my_string.indices.forEach { answer += my_string.slice(it until my_string.length) }

        answer.sort()

        return answer
    }
}