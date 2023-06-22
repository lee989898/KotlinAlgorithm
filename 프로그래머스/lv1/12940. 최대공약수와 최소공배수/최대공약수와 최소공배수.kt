class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = IntArray(2) { 0 }
        var min = 1
        
        for(num in 2..n) {
            if(n % num == 0 && m % num == 0) {
                min = num
            }
        }
        
        answer[0] = min
        answer[1] = n * m / min
        
        return answer
    }
}