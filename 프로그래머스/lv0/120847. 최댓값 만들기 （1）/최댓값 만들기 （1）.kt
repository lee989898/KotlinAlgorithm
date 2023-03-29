class Solution {
    fun solution(numbers: IntArray) = numbers.sorted().takeLast(2).reduce { i, acc -> acc * i }
}
