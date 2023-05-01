class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer = IntArray(arr.sum())
        var i = 0
        arr.forEach { num ->
            repeat(num) {
                answer[i++] = num
            }
        }
        return answer
    }
}