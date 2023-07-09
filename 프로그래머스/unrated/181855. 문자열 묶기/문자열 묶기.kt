class Solution {
    fun solution(strArr: Array<String>) = strArr.groupBy { it.length }.values.maxOf { it.size }
}