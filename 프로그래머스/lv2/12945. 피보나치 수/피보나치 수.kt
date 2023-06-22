class Solution {
    fun solution(n: Int): Int {
        var ans = Array(n + 1) { 0 }
        ans[1] = 1
        for(i in 2..n) {
            ans[i] = (ans[i - 1] + ans[i - 2]) % 1234567
        }
                
        return ans[n] 
    }
}
