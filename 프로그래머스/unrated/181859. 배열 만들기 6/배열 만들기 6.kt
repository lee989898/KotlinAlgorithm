import java.util.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = Stack<Int>()
        var i = 0

        while (i < arr.size) {
            if(stk.isEmpty()) {
                stk.push(arr[i])
                i += 1
            } else {
                if (stk.peek() == arr[i]) {
                    stk.pop()
                    i += 1
                } else {
                    stk.push(arr[i])
                    i += 1
                }
            }
        }
        
        if (stk.isEmpty()) {
            return intArrayOf(-1)
        }

        return stk.toIntArray()
    }
}