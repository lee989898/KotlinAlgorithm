class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val failureRates = mutableListOf<Pair<Int, Double>>()
        for (stage in 1..N) {
            val totalPlayers = stages.count { it >= stage }
            val playersInStage = stages.count { it == stage }
            val failureRate = if (totalPlayers == 0) 0.0 else playersInStage.toDouble() / totalPlayers.toDouble()
            failureRates.add(stage to failureRate)
        }

        failureRates.sortWith(compareByDescending<Pair<Int, Double>> { it.second }.thenBy { it.first })

        return failureRates.map { it.first }.toIntArray()
    }
}
