class Solution {
    fun solution(num_list: IntArray, n: Int) = (num_list + num_list).copyOfRange(n, n + num_list.size)
}