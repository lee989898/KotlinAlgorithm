class Solution {
    fun solution(arr: IntArray): IntArray {

        return arr.filter { it != arr.minOrNull() }.toIntArray().run {
            if (this.isEmpty())
                intArrayOf(-1)
            else
                this
        }
    }
}