class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0

        repeat(included.size) {
            if (included[it]) {
                answer += a + d * it
            }
        }

        return answer
    }
}