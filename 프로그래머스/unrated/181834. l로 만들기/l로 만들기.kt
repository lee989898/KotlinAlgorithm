class Solution {
    fun solution(myString: String) = myString.map { if (it in 'a'..'k') 'l' else it }.joinToString("")
}