class Solution {
    fun solution(numbers: IntArray) = numbers.sorted().takeLast(2).reduce { a, b -> a * b }
}