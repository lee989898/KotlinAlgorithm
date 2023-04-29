class Solution {
    fun solution(sides: IntArray) = if (sides.sum() - (sides.maxOrNull()!! * 2) > 0) 1 else 2
}