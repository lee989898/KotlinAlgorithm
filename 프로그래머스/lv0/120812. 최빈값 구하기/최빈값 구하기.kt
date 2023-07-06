class Solution {
    fun solution(array: IntArray): Int {
        val answer = Array(1001) { 0 }

        array.forEach { answer[it]++ }

        return if (answer.count { it == answer.maxOrNull() } == 1)
            answer.indexOf(answer.maxOrNull())
        else
            -1
    }
}