class Solution {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf<Int>()

        for (index in 1..n) {
            if (n % index == 0)
                answer.add(index)
        }

        return answer.toIntArray()
    }
}