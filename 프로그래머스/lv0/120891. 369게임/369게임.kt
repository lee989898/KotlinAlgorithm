class Solution {
    fun solution(order: Int) = order.toString().map { it.digitToInt() }.count { it == 3 || it == 6 || it == 9 }
}