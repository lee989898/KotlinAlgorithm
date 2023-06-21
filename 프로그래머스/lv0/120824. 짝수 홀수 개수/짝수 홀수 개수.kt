class Solution {
    fun solution(numList: IntArray) = intArrayOf(numList.filter { it % 2 == 0 }.size, numList.filter { it % 2 == 1 }.size)
}