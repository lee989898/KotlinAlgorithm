class Solution {
    fun solution(num_list: IntArray): IntArray {
        val even = num_list.count { it % 2 == 0 }
        val odd = num_list.size - even
        return intArrayOf(even, odd)
    }
}