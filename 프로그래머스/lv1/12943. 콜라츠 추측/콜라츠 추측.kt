class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var num = num
        
        if (num == 1)
            return 0
        
        while(answer < 501) {
            answer += 1
            
            if (num % 2 == 0)
                num /= 2
            else if(num % 2 == 1) {
                num = num * 3 + 1
            }
            
            if (num == 1)
                return answer
        }
        
        return -1
    }
}