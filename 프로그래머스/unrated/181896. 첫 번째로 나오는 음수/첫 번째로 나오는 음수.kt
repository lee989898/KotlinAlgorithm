class Solution {
    fun solution(num_list: IntArray) = num_list.indexOf(num_list.find { it < 0 } ?: -1)
}