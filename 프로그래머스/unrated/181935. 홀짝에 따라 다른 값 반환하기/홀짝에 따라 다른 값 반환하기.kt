class Solution {
    fun solution(n: Int) = if(n % 2 != 0) {
            (1..n).filter { it % 2 != 0 }.reduce { a, b -> a + b }
        } else {
            (2..n).filter { it % 2 == 0 }.map { it * it }.reduce { a, b -> a + b }
        }
}