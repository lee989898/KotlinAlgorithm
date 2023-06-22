class Solution {
    fun solution(numbers: IntArray): IntArray {        
        val set = mutableSetOf<Int>()
        
        for (i in 0 until numbers.size - 1) {
            for(j in i+1 until numbers.size) {                
                set.add(numbers[i] + numbers[j])
            }
        }
        
        return set.toIntArray().sortedArray()
    }
}