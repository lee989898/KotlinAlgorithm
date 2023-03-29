class Solution {
    fun solution(numbers: IntArray): Int {
        val nums = numbers.sortedDescending()
        return nums[0] * nums[1]
    }
}