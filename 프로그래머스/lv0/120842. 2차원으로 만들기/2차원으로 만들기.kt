class Solution {
    fun solution(num_list: IntArray, n: Int): MutableList<MutableList<Int>> {
        var answer = MutableList<MutableList<Int>>(num_list.size / n) { mutableListOf() }

        for (i in num_list.indices step n) {
            for (j in i until i + n) {
                answer[i / n] += num_list[j]
            }
        }

        return answer
    }
}