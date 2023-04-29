class Solution {
    fun solution(num_list: IntArray) =
        num_list.filter { it % 2 == 0 }.reduce { acc, i -> acc * 10 + i } + num_list.filter { it % 2 != 0 }
            .reduce { acc, i -> acc * 10 + i }
}