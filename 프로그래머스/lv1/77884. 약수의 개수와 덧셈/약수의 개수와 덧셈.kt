class Solution {
    fun solution(left: Int, right: Int): Int {
        var result = 0

        (left..right).forEach { num ->
            var answer = 0
            (1..num).forEach { if (num % it == 0) answer++ }
            if (answer % 2 == 0)
                result += num
            else
                result -= num
        }

        return result
    }
}