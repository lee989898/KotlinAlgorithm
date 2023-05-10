class Solution {
    fun solution(numbers: IntArray) = (0..9).filterNot(numbers::contains).sum()
}