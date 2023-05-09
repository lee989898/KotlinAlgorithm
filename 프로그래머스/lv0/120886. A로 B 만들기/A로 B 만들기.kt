class Solution {
    fun solution(before: String, after: String) =
        if (after.toList().sorted().joinToString("").contains(before.toList().sorted().joinToString(""))) 1 else 0
}