class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val (a, b, c) = slicer
        
        return when(n) {
            1 -> num_list.slice(0..b)
            2 -> num_list.slice(a until num_list.size)
            3 -> num_list.slice(a..b)
            else -> num_list.slice(a..b step c)
        }.toIntArray()
    }
}