class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        num_list.forEach {
            var num = it
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2
                } else {
                    num -= 1
                    num /= 2
                }
                answer++
            }
        }

        return answer
    }
}