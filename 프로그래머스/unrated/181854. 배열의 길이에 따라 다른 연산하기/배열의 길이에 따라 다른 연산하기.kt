class Solution {
    fun solution(arr: IntArray, n: Int): List<Int> {
        return if (arr.size % 2 != 0) {
            arr.mapIndexed { index, i -> if (index % 2 == 0) i + n else i }
        } else {
            arr.mapIndexed { index, i -> if (index % 2 != 0) i + n else i }
        }
    }
}