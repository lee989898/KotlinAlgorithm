class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0

        for (i in babbling.indices) {
            if (babbling[i].replace("aya", "1")
                    .replace("ye", "1")
                    .replace("woo", "1")
                    .replace("ma", "1").all { it == '1' }
            ) {
                answer += 1
            }
        }

        return answer
    }
}