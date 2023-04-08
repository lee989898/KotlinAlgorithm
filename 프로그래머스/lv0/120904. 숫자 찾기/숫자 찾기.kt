class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = -1
        num.toString().forEachIndexed { index, char ->
            print(char)
            if (char.toString() == k.toString() && answer == -1) {
                answer = index + 1
            }
        }
        return answer
    }
}