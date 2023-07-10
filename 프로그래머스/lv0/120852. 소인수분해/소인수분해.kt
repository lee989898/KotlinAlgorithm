class Solution {
    fun solution(n: Int): Set<Int> {
        val answer = mutableSetOf<Int>()
        var num = n
        var i = 2

        while (num > 1) {
            if (num % i == 0) {
                answer += i
                num /= i
            } else {
                i++
            }
        }

        return answer
    }
}