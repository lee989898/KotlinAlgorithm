class Solution {
    fun solution(n: Int) = n.toString().map { it.digitToInt() }.sum()
}