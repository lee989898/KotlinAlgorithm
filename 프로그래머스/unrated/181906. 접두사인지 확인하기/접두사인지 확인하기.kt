class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 1
        
        if (is_prefix.length > my_string.length)
            return 0
        
        for (i in 0 until is_prefix.length) {
            if (my_string[i] != is_prefix[i])
                answer = 0
        }
        
        return answer
    }
}