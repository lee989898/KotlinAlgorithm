class Solution {
    fun solution(numbers: IntArray) = (listOf(1,2,3,4,5,6,7,8,9) - numbers.toSet()).sum()
}