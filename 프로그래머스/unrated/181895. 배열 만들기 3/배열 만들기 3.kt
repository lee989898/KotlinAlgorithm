class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>) = intervals.flatMap { ints -> arr.sliceArray(IntRange(ints[0], ints[1])).toList() }
}