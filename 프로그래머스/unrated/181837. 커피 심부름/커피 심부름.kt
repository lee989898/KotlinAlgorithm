class Solution {
    fun solution(order: Array<String>) =
        order.fold(0) { acc, s -> if (s.contains("cafelatte")) acc + 5000 else acc + 4500 }
}