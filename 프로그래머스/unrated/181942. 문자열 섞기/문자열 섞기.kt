class Solution {

    fun solution(str1: String, str2: String): String {
        val stringBuilder = StringBuilder()

        str1.zip(str2).forEach {
            stringBuilder.append(it.first)
            stringBuilder.append(it.second)
        }
        
        return stringBuilder.toString()
    }
}
