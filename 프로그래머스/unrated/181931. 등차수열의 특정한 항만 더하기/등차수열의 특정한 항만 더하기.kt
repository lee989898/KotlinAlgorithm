class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var _a = a
        
        repeat(included.size) {
            if (included[it]) {
                answer += _a
            }
            _a += d
        }
        
        return answer
    }
}