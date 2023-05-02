class Solution {
    fun solution(phone_number: String): String {
        var answer = ""

        repeat(phone_number.length - 4) {
            answer += "*"
        }
        
        answer += phone_number.takeLast(4)

        return answer
    }
}