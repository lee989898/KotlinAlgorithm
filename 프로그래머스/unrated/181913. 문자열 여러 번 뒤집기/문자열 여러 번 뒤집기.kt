class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string

        queries.forEach { (a, b) ->
            val old = answer.slice(a..b)
            answer = answer.slice(0 until a) + answer.slice(a..b).reversed() + answer.slice(b+1 until my_string.length)
        }

        return answer
    }
}