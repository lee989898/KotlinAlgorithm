class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        arr.forEachIndexed { index, i -> repeat(i) { answer.add(arr[index]) } }
        return answer.toIntArray()
    }
}