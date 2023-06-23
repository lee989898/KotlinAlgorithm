class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = mutableListOf<Int>()
        val sum = brown + yellow
        
        for(i in sum downTo 1) {
            if(sum % i == 0) {
                val a = i
                val b = sum / i
                if((a - 2) * (b - 2) == yellow) {
                    answer.add(a)
                    answer.add(b)
                    break
                }
            }
        }

        return answer.toIntArray()
    }
}
