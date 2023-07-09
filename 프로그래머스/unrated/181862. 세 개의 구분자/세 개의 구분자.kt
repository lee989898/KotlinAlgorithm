class Solution {
    fun solution(myStr: String) = myStr.split("a|b|c".toRegex()).filter { it.isNotBlank() }.let { it.ifEmpty { listOf("EMPTY") } }
}