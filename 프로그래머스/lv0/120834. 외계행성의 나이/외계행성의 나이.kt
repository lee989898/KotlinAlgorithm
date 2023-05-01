class Solution {
    fun solution(age: Int): String {
        val alphabet = ('a'..'z').toList()
        return age.toString().map { alphabet[it - '0'] }.joinToString("")
    }
}
