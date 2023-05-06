class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>) = intervals.flatMap { (left, right) -> arr.slice(left..right) }
}