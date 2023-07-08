class Solution {
    fun solution(arr: IntArray): IntArray {
        val a = arr.indexOf(2)
        val b = arr.indexOfLast { it == 2 }

        return if(a == -1 && b == -1) {
            intArrayOf(-1)
        } else if (b == -1) {
            intArrayOf(a)
        } else {
            arr.sliceArray(a..b)
        }
    }
}