class Solution {
    fun solution(s: String): IntArray {
        var s = s
        var count = 0
        var zeroCount = 0
        
        while (s != "1") {
            val rmZeroNum = s.count { it == '0' }
            s = Integer.toBinaryString(s.length - rmZeroNum)
            count++
            zeroCount += rmZeroNum
        }
        
        return intArrayOf(count,zeroCount)
    }
}