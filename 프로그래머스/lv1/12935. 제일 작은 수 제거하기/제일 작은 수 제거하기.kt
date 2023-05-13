class Solution {
    fun solution(arr: IntArray) = arr.filter { it != arr.minOrNull() }.run {
        this.ifEmpty { intArrayOf(-1) }
    }
}