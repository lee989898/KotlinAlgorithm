class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        val set = mutableSetOf<Char>()
        val list = mutableListOf<Char>()

        my_string.forEach {
            if (!set.contains(it)) {
                set.add(it)
                list.add(it)
            }
        }

        return list.joinToString("")
    }
}