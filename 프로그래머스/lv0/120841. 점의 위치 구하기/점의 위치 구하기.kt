class Solution {
    fun solution(dot: IntArray) = dot.let { (x, y) ->
        when {
            x > 0 && y > 0 -> 1
            x < 0 && y > 0 -> 2
            x < 0 && y < 0 -> 3
            else -> 4
        }
    }
}