val list = MutableList<Int>(100001){ 0 }

class Solution {
    fun solution(n: Int): Int {
        list[0] = 0
        list[1] = 1
        
        for(i in 2..n) {
            list[i] = (list[i - 1] % 1234567 + list[i - 2] % 1234567) % 1234567
        }
                
        return list[n] % 1234567
    }
}
