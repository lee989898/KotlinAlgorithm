class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var n = n
        
        while (n > 0) {
            answer += n % 10
            n /= 10
        }
        

        return answer
    }
}