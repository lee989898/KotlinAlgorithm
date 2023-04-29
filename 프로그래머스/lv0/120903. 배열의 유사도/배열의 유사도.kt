class Solution {
    fun solution(s1: Array<String>, s2: Array<String>) = s2.count { s1.contains(it) }
}