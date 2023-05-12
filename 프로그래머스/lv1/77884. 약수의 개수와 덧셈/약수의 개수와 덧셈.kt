class Solution {
    fun solution(left: Int, right: Int) =
        (left..right).sumOf { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }
}
