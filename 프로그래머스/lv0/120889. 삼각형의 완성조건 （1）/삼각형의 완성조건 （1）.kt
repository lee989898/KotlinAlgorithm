class Solution {
    fun solution(sides: IntArray) = sides.sorted().let { if(it[2] < it[0] + it[1]) 1 else 2 }
}