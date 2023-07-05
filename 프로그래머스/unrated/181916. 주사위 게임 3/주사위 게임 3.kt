import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val arr = Array(7) { 0 }

        arr[a]++
        arr[b]++
        arr[c]++
        arr[d]++

        return if (arr.any { it == 4 }) {
            arr.indexOf(4) * 1111
        } else if (arr.count { it == 1 } == 4) {
            arr.indexOf(1)
        } else if (arr.any { it == 3}) {
            (10 * arr.indexOf(3) + arr.indexOf(1)).pow()
        } else if (arr.count { it == 2} == 2) {
            (arr.indexOf(2) + arr.lastIndexOf(2)) * abs(arr.indexOf(2) - arr.lastIndexOf(2))
        } else {
            (arr.indexOf(1) * arr.lastIndexOf(1))
        }
    }
}

fun Int.pow() = this * this
