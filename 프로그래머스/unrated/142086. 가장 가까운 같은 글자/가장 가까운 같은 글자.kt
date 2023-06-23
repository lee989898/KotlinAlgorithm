class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var str = ""
        val list = mutableListOf<Int>()
        
        for(char in s) {
           if(!str.contains(char)) {
               list.add(-1)
               str += char
           } else {
               list.add(str.reversed().indexOf(char) + 1)
               str += char
           }
        }
        
        return list.toIntArray()
    }
}