class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0

        for(i in 0..myString.length - pat.length) {
            if(myString.slice(i until i + pat.length) == pat) {
                answer += 1
            }
        }

        return answer
    }
}