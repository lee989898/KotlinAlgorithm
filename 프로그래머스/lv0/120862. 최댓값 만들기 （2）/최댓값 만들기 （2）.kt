import kotlin.math.max

class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        return max(numbers[0] * numbers[1], numbers[numbers.lastIndex - 1] * numbers[numbers.lastIndex])
    }
}