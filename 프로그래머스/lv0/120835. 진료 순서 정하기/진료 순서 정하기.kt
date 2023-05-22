class Solution {
    fun solution(e: IntArray) = e.map { e.sortedDescending().indexOf(it) + 1 }
}
