class Solution {
    fun solution(numbers: IntArray): Int {
        val (a, b) = numbers.sorted().takeLast(2)
        return a * b
    }
}