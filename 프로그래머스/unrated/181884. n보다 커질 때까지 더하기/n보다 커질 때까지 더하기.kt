class Solution {
    fun solution(numbers: IntArray, n: Int) = numbers.fold(0) { total, num -> if (n >= total) total + num else total }
}
