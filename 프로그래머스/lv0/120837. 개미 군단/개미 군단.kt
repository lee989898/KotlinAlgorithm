class Solution {
    fun solution(hp: Int): Int {
        var answer = 0
        var remainHp = hp

        answer += remainHp / 5
        remainHp %= 5
        answer += remainHp / 3
        remainHp %= 3
        answer += remainHp

        return answer
    }
}