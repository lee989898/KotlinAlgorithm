import kotlin.math.pow

class Solution {
    fun solution(num_list: IntArray) = if(num_list.reduce { acc, i -> acc * i } < num_list.sum().toDouble().pow(2)) 1 else 0
}