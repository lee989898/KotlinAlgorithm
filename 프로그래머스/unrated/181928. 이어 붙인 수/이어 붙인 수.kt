class Solution {
    fun solution(numList: IntArray) = numList.partition { it % 2 == 0 }.toList().sumOf { it.joinToString("").toInt() }
}
