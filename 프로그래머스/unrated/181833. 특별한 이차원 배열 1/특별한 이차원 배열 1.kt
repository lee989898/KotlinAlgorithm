class Solution {
    fun solution(n: Int): Array<Array<Int>> {
        val arr = Array(n) { Array(n) { 0 }}

        for(i in arr.indices) {
            for(j in arr[i].indices) {
                if(i == j)
                    arr[i][j] = 1
            }
        }

        return arr
    }
}