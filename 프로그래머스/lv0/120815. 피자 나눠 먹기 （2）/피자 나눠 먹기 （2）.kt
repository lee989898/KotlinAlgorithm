class Solution {
    fun solution(n: Int): Int {
        var answer: Int = n


        while (answer % 6 != 0) {
            answer += n
        }


        return answer / 6
    }
}
