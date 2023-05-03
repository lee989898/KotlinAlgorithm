class Solution {
    fun solution(n: Long): Long {
        for (i in 1..n) {
            if (i * i == n) {
                return (i + 1L) * (i + 1L)
            }
        }
        
        return -1
    }
}