class Solution {
    fun solution(my_string: String) = my_string.filter(Char::isDigit).map { it.digitToInt() }.sum()
}