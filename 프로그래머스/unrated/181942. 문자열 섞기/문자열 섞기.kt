class Solution {

    fun solution(str1: String, str2: String) = StringBuilder().apply {
        str1.zip(str2).forEach {
            append(it.first)
            append(it.second)
        }
    }.toString()
}
