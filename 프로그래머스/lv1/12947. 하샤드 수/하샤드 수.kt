class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().map { it.digitToInt() }.sum()
        
        return if (x % sum == 0) {
            true
        } else {
            false
        }
    }
}