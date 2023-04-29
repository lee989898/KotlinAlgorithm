class Solution {
    fun solution(a: Int, b: Int) = if ("$a$b".toInt() > "$b$a".toInt())
        "$a$b".toInt()
    else
        "$b$a".toInt()
}