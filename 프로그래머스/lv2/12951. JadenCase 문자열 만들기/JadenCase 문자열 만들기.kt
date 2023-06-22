class Solution {
    fun solution(s: String): String {
        var answer = ""
        var isFirst = true
        for(i in s.indices) {       
            
            if (isFirst) {
                if (s[i] !in '0'..'9') {
                    answer += s[i].uppercase() 
                 } else {
                    answer += s[i]
                }
                isFirst = false
            }
            else if (s[i] == ' ') {
                answer += s[i]
            } else {
                answer += s[i].lowercase()
                isFirst = false
            }
            
            if (s[i] == ' ') {
                isFirst = true
            }
        }
        
        return answer
    }
}