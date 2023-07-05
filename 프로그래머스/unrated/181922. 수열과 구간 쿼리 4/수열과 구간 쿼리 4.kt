class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {        
        queries.forEach { (s, e, k) ->
            if(k != 0) {
                for(i in s..e) {
                    if(i % k == 0) {
                      arr[i]++
                    }
                }                
            }
            

        }
        return arr
    }
}