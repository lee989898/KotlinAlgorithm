class Solution {
    fun solution(n: Int) = if(n % 2 != 0) {
            (1..n).filter { it % 2 != 0 }.sum()
        } else {
            (2..n).filter { it % 2 == 0 }.map { it * it }.sum()
        }
}