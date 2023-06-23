class Solution {
    fun solution(word: String): Int {
        var answer = 0
        val aeiou = listOf('A','E','I','O','U')
        val list = mutableListOf<String>()
        
        for(i in aeiou) {
            list.add("$i")
            for(j in aeiou) {
                list.add("$i$j")
                for(k in aeiou) {
                    list.add("$i$j$k")
                    for(l in aeiou) {
                        list.add("$i$j$k$l")
                        for(m in aeiou) {
                            list.add("$i$j$k$l$m")
                        }
                    }
                }
            }
        }
        
        answer = list.indexOf(word)
        
        return answer + 1
    }
}