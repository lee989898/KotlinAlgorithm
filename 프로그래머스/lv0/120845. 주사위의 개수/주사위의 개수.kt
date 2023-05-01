class Solution {
    fun solution(box: IntArray, n: Int) = box.fold(1) { acc, i -> acc * (i / n) }
}