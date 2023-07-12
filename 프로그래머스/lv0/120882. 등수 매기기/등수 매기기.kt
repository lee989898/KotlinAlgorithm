class Solution {
    fun solution(score: Array<IntArray>): List<Int> {
        val sortedScore = score.map{ it.average() }
        return score.map { sortedScore.sortedDescending().indexOf((it[0] + it[1]) / 2.0) + 1 }
    }
}
