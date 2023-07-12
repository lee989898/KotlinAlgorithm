class Solution {
    fun solution(A: String, B: String): Int {
        var answer = 0
        var a = A

        repeat(A.length) {
            if (a == B) {
                return answer
            }
            answer+= 1
            a = a[a.lastIndex] + a.slice(0 until a.lastIndex)
        }

        return -1
    }
}