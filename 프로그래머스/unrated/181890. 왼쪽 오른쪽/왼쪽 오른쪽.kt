class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        
        for (i in str_list.indices) {
            if (str_list[i] == "l") {
                return str_list.sliceArray(0 until str_list.indexOf("l"))
            } else if (str_list[i] == "r") {
                return str_list.sliceArray(str_list.indexOf("r") + 1 until str_list.size)
            }
        }
        
        return arrayOf()
    }
}