class Solution {
    fun solution(s: String) =
        "${s.split(" ").minOfOrNull { it.toInt() }} ${s.split(" ").maxOfOrNull { it.toInt() }}"
}
