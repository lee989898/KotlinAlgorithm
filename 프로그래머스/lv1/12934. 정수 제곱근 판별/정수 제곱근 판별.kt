import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val sqrt = sqrt(n.toDouble()).toLong()
        
        if ((sqrt * sqrt) == n) {
            answer = (sqrt + 1L) * (sqrt.toLong() + 1L)
        } else {
            answer = -1
        }
        
        return answer
    }
}