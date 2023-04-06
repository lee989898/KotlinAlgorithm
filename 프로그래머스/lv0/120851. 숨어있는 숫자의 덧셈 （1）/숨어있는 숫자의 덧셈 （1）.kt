class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0

        for(word in my_string) {
            if (word in '1'..'9') 
                answer += word - '0'
        }

        return answer
    }
}