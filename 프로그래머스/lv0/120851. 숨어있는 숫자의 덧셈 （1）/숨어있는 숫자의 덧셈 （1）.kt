class Solution {
    fun solution(myString: String) = myString.filter { it.isDigit() }.map { c -> c.toString().toInt() }.sum()
}