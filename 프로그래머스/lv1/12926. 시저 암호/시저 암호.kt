class Solution {
    fun solution(s: String, n: Int): String {
        var a = ('a'..'z').toList()
        var b = ('A'..'Z').toList()

        return s.map { if(it == ' ') it else if(it in 'a'..'z') {(a[(a.indexOf(it) + n) % 26]) } else { b[(b.indexOf(it) + n) % 26] } }.joinToString("")
    }
}