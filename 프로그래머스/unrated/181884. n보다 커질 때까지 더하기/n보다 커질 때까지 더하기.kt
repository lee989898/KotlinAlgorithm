class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        var i = 0
        
        while(answer <= n) {
            answer += numbers[i++]
        }
        
        return answer
    }
}