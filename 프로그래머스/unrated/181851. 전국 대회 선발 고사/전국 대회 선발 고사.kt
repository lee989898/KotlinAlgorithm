class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val ranks = mutableListOf<Int>()
        rank.zip(attendance.toList()).sortedBy { it.first }.forEach { if (it.second) ranks.add(it.first) }
        return (10000 * rank.indexOf(ranks[0])) + (100 * rank.indexOf(ranks[1])) + rank.indexOf(ranks[2])
    }
}