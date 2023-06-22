class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        
        if (s.length == 4 || s.length == 6) {
            answer = true
        } else {
            return false
        }
        
        for(char in s) {            
            if(char in 'a'..'z' || char in 'A'..'Z') {
                answer = false
                break
            }
        }
                
        return answer
    }
}