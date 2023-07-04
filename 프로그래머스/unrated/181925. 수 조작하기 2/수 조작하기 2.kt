class Solution {
    fun solution(numLog: IntArray): String {
        val map = mapOf(1 to "w", -1 to "s", 10 to "d", -10 to "a")
        val nums = mutableListOf<Int>()

        for (i in 1 until numLog.size) {
            nums.add(numLog[i] - numLog[i - 1])
        }

        var answer: String = ""

        nums.forEach {
            answer += map[it]
        }

        return answer
    }
}