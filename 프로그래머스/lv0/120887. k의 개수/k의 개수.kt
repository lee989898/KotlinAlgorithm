class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0

        for(num in i..j) {
            answer += num.toString().count { it.digitToInt() == k }
        }

        return answer
    }
}