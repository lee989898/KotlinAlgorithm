class Solution {
    fun solution(n: Int) = (1..n).filterNot { it % 2 == 0 }
}