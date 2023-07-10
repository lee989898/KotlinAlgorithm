import java.util.*;

class Solution {
    fun solution(arr: IntArray): Stack<Int> {
        val stk = Stack<Int>()

        for (i in arr.indices) {
            if (stk.isEmpty()) {
                stk.push(arr[i])
            } else if (stk.peek() == arr[i]) {
                stk.pop()
            } else {
                stk.push(arr[i])
            }
        }
        if (stk.isEmpty()) stk.push(-1)
        return stk
    }
}