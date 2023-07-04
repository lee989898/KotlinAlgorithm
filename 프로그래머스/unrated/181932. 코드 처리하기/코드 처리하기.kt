class Solution {
    fun solution(code: String): String {
        var mode = true
        var answer = ""

        for(i in code.indices) {
            if(code[i] == '1') {
                mode = !mode
            } else if(mode && i % 2 == 0) {
                answer += code[i]
            } else if(!mode && i % 2 != 0) {
                answer += code[i]
            }
        }

        return if(answer.isEmpty())
            "EMPTY"
        else
            answer
    }
}