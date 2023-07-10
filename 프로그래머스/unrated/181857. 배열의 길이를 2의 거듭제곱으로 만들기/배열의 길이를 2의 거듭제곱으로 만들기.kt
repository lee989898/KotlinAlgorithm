class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer = arr.toMutableList()
        var result = 1

        while(arr.size > result) {
            result *= 2
        }

        repeat(result - arr.size) {
            answer.add(0)
        }

        return answer.toIntArray()
    }
}