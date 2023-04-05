class Solution {
    fun solution(n: Int): List<Int> {
        val answer = mutableListOf<Int>()
        var num = n
        while (num != 0) {
            if (num % 2 != 0)
                answer.add(num)
            num--
        }
        return answer.sorted()
    }
}