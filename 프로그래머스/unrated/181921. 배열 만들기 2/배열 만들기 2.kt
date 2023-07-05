class Solution {
    fun solution(l: Int, r: Int): List<Int> {
        return (l..r).filter { it.toString().all { ch -> ch == '0' || ch == '5' } }.takeIf { it.isNotEmpty() } ?: listOf(-1)
    }
}