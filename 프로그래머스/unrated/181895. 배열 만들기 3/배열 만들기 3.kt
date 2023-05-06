class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer += arr.slice(intervals[0][0]..intervals[0][1])
        answer += arr.slice(intervals[1][0]..intervals[1][1])
        
        return answer
    }
}