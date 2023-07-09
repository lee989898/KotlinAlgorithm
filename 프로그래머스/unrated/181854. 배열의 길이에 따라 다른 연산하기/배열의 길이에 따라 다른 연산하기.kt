class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = arr
        
        if(arr.size % 2 == 0) {
            (1 until arr.size step 2).forEach { answer[it] += n }
        } else {
            (0 until arr.size step 2).forEach { answer[it] += n }
        }
        
        return answer
    }
}