import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var n = n
        var answer: Int = 0
        var str = ""
        
        while(n != 0) {
            str += (n % 3).toString()
            n /= 3
        }
        
        var i = str.length - 1
        for(char in str) {
            answer += char.digitToInt() * ((3.0).pow(i)).toInt()
            i--
        }
        
        return answer
    }
}