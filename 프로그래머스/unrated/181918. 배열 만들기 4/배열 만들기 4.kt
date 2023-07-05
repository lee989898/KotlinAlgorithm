import java.util.Stack

class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk = Stack<Int>()

        var i = 0

        while(i < arr.size) {
            if(stk.isEmpty()) {
                stk.push(arr[i++])
            } else if (stk[stk.lastIndex] < arr[i]) {
                stk.push(arr[i++])
            } else {
                stk.pop()
            }
        }

        return stk.toIntArray()
    }
}