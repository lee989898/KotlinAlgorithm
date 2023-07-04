class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray) = included.indices.filter { included[it] }.sumOf { a + d * it }
}
