class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = IntArray(strlist.size)
        for (index in strlist.indices) {
            answer[index] = strlist[index].length
        }
        return answer
    }
}