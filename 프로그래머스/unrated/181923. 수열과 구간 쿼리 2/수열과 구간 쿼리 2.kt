class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        
        for (querie in queries) {
            val temp = arr.slice(querie[0]..querie[1]).sorted()
            
            answer.add(temp.find { it > querie[2] } ?: -1)
        }

        return answer.toIntArray()
    }
}