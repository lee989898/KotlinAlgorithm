class Solution {
    fun solution(numbers: IntArray, k: Int) = numbers[(k - 1) * 2 % numbers.size]
}