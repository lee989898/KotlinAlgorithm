import kotlin.math.*

class Solution {
    fun solution(answers: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val one = listOf(1, 2, 3, 4, 5)
        val two = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val three = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var (a, b, c) = listOf(0, 0, 0)

        for ((i, ans) in answers.withIndex()) {
            if (ans == one[i % 5]) {
                a++
            }
            if (ans == two[i % 8]) {
                b++
            }
            if (ans == three[i % 10]) {
                c++
            }
        }
        val max = listOf(a, b, c).maxOrNull()

        if (a == max) {
            answer.add(1)
        }
        if (b == max) {
            answer.add(2)
        }

        if (c == max) {
            answer.add(3)
        }

        return answer.toIntArray()
    }
}
