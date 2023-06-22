class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        
        for(i in 0..t.length - p.length) {
            if (t.slice(i..(p.length - 1 + i)) <= p) {
                answer += 1
            }
        }
        
        return answer
    }
}