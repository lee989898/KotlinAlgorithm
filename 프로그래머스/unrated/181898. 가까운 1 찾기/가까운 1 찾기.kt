class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer = arr.indices.find { it >= idx && arr[it] == 1} ?: - 1
        
        return answer
    }
}