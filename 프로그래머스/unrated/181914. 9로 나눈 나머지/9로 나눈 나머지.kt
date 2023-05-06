class Solution {
    fun solution(number: String) = number.map { it.digitToInt() }.sum() % 9
}