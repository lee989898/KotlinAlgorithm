class Solution {
    fun solution(arr: IntArray, k: Int): List<Int> {
        return (0 until k).map { if (it >= arr.toSet().size) -1 else arr.distinct()[it] }
    }
}