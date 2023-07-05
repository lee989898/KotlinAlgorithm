class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer = mutableListOf<Int>()
        
        for(i in l..r) {
            val c = i.toString()
            
            if(c.contains("1") || c.contains("2") || c.contains("3") || c.contains("4") || c.contains("6") || c.contains("7") || c.contains("8") ||
                    c.contains("9"))
                continue
            
            if(c.contains("5") || c.contains("0"))
                answer.add(i)
            
        }
        
        if(answer.isEmpty()) {
            return intArrayOf(-1)
        } else {
            return answer.toIntArray()
        }
    }
}