import kotlin.math.*

class Solution {
    fun solution(arr: IntArray) = if(arr.size == 1) arrayOf(-1).toIntArray() else arr.filterNot { it == arr.minOrNull() }.toIntArray()
}
