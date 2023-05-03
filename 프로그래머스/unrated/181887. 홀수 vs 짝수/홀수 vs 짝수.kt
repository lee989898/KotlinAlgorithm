import kotlin.math.max

class Solution {
    fun solution(num_list: IntArray) = num_list.indices.partition { it % 2 == 1 }.let { (oddList, evenList) ->
        max(oddList.sumOf { num_list[it] }, evenList.sumOf { num_list[it] })
    }
}
