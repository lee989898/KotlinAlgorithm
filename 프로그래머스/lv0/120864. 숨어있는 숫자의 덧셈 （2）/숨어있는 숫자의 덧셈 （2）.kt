class Solution {
    fun solution(my_string: String) =
        my_string.split("[A-z]+".toRegex())
           .filter(String::isNotEmpty)
           .sumOf(String::toInt)
}
