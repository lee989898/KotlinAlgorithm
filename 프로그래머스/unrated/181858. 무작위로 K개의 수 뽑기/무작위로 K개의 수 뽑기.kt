class Solution {
    fun solution(arr: IntArray, k: Int): MutableList<Int> {
        val answer = arr.toSet().toMutableList()

        return if(answer.size >= k) {
            answer.take(k).toMutableList()
        } else {
            repeat(k - answer.size) {
                answer.add(-1)
            }
            answer
        }
    }
}