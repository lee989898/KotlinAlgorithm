class Solution {
    fun solution(arr: IntArray, idx: Int) = (idx until arr.size).firstOrNull { arr[it] == 1 } ?: -1
}