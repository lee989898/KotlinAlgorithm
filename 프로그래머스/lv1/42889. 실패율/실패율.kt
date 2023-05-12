class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        var people = stages
        val double = mutableListOf<Double>()

        repeat(N) { stage ->
            double += people.count { it <= stage + 1 } / people.size.toDouble()
            people = people.filter { it != stage + 1 }.toIntArray()
        }
        
        (1..N).toList().zip(double).sortedWith(
            compareBy(
                { -it.second },
                { it.first }
            )
        ).forEach { answer += it.first }

        return answer
    }
}
