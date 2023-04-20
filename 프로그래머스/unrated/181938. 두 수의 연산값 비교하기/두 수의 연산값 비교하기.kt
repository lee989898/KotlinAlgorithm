class Solution {
    fun solution(a: Int, b: Int) = if ("$a$b".toInt() > 2 * a * b)
        "$a$b".toInt()
    else
        2 * a * b
}