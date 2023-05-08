class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        myStr.split('a', 'b', 'c').forEach {
            if (it != "") {
                answer += it
            }
        }
        
        return if (answer.isEmpty()) {
            arrayOf("EMPTY")
        } else answer
    }
}