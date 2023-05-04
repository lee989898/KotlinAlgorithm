class Solution {
    fun solution(n: Int) = (1..n).count { i -> (1..i).count { i % it == 0 } > 2 }
}