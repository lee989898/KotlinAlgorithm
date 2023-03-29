class Solution {
    fun solution(num_list: IntArray): IntArray {
        val odd = num_list.count { it % 2 != 0 }
        return intArrayOf(num_list.size - odd, odd)
    }
}