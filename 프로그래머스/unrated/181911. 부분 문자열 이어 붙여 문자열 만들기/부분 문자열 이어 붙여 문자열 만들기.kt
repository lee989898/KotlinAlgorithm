class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>) =
        my_strings.mapIndexed { i, v -> my_strings[i].slice(parts[i][0]..parts[i][1]) }.joinToString("")
}