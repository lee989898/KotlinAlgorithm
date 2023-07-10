class Solution {
    fun solution(n: Int): Int {
        var x = 1
        var y = 1
        
        while(x != n) {
            x++
            y++
            while(true) {                
                if(y % 3 != 0 && !y.toString().contains("3"))
                    break
                y++
            }
        }
        
        return y
    }
}