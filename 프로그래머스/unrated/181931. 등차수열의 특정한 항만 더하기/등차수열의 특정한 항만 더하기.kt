class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray) = (a until a + d * included.size step d).toList().zip(included.toList()).filter { it.second }.sumOf { it.first }
}