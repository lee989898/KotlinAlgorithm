class Solution {
    fun solution(my_string: String, indices: IntArray) = my_string.filterIndexed { index, c -> !indices.contains(index) }
}