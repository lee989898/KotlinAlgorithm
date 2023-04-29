class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2
        (1..n).forEach { if (it * it == n) answer = 1 }
        return answer
    }
}