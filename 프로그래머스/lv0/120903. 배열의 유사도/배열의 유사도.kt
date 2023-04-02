class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (i in s1.indices) {
            for (j in s2.indices) {
                if (s1[i] == s2[j])
                    answer++
            }
        }
        return answer
    }
}