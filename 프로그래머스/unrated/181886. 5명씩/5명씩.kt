class Solution {
    fun solution(names: Array<String>) = names.filterIndexed { index, s -> index % 5 == 0 }
}