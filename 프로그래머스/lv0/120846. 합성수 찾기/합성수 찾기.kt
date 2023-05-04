class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        (1..n).forEach { a -> if ((1..a).count { b -> a % b == 0 } >= 3) answer += 1 }
        
        return answer
    }
}