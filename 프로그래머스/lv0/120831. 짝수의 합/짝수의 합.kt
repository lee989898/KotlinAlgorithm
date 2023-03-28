class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(index in 2..n) {
            if(index % 2 == 0) {
                answer += index
            }
        }
        return answer
    }
}