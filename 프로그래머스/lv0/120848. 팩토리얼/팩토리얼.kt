class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1

        while (factorial(answer) <= n) {
            answer++
        }

        return answer - 1
    }
}

fun factorial(n: Int): Int {
    var result = 1

    (1..n).forEach { result *= it }

    return result
}