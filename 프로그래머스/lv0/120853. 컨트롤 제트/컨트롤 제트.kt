import java.util.*

class Solution {
    fun solution(s: String): Int {
        val answer = Stack<Int>()

        s.split(" ").forEach { if (it != "Z") answer.push(it.toInt()) else answer.pop() }

        return answer.sumOf { it }
    }
}