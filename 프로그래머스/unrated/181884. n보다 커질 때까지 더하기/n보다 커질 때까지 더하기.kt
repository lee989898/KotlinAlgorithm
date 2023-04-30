class Solution {
    fun solution(numbers: IntArray, n: Int) = numbers.reduce { acc, i -> if (acc <= n) acc + i else acc  }
}