class Solution {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0
        strArr.groupBy { it.length }.map { it.value }.forEach { if (answer <= it.size) answer = it.size }
        return answer
    }
}