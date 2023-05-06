class Solution {
    fun solution(names: Array<String>) = names.toList().chunked(5) { it[0] }
}