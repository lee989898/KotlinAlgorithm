class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var num = n

        while (num != 1) {
            answer += num
            
            if (num % 2 == 0) {
                num /= 2
            } else {
                num = (3 * num) + 1
            }
        }
        answer += 1

        return answer
    }
}