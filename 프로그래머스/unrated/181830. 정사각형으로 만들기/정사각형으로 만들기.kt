import kotlin.math.max

class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val max = max(arr.size, arr[0].size)
        val answer = Array(max) { IntArray(max) { 0 } }
        
        for (i in arr.indices) {
            for (j in arr[i].indices) {
                answer[i][j] = arr[i][j]
            }
        }
        
        return answer
    }
}