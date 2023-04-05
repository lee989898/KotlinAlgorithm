class Solution {
    fun solution(sides: IntArray): Int {
        val arr = sides.sorted()
        return if (arr[2] < arr[0] + arr[1])
            1
        else
            2
    }
}