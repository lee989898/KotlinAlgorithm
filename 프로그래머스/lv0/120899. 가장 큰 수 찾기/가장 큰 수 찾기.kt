class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        array.let {
            answer += it.maxOrNull()!!
            answer += array.indexOf(it.maxOrNull()!!)
        }

        return answer
    }
}