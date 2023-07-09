class Solution {
    fun solution(names: Array<String>) = names.toList().chunked(5).map { it[0] }
}