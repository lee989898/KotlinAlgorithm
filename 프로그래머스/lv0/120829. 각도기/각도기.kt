class Solution {
    fun solution(angle: Int) = when {
        angle in 1 until 90 -> 1
        angle == 90 -> 2
        angle in 91 until 180 -> 3
        else -> 4
    }
}