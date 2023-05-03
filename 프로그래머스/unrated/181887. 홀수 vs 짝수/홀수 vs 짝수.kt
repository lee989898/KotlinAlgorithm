import kotlin.math.max

class Solution {
    fun solution(num_list: IntArray) = num_list.let { nums ->
        val odd = nums.filterIndexed { index, i -> (index + 1) % 2 == 0 }.sum()
        val even = nums.filterIndexed { index, i -> (index + 1) % 2 != 0 }.sum()
        max(odd, even)
    }
}
