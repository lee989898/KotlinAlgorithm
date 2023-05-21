import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = abs(n - array[0])
        var result = 0

        array.sortedDescending().forEach { if (abs(n - it) <= answer) {
            answer = abs(n - it)
            result = it
        } }

        return result
    }
}