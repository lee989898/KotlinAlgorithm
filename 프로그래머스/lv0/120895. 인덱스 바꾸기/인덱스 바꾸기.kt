class Solution {
    fun solution(my_string: String, num1: Int, num2: Int) = my_string.indices.map { if (it == num1) my_string[num2] else if (it == num2) my_string[num1] else my_string[it] }.joinToString("")
}
