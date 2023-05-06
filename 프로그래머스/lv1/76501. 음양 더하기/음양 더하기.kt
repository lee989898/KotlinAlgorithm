class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray) =
        absolutes.zip(signs.toTypedArray()).sumOf { (a, b) -> if (b) a else -a }
}