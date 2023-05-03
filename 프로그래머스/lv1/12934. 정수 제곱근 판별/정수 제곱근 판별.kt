import kotlin.math.sqrt

class Solution {
    fun solution(n: Long) = n.toDouble().let {
        if (sqrt(it).toLong() * sqrt(it).toLong() == it.toLong()) ((sqrt(it) + 1L) * (sqrt(it) + 1L)).toLong() else -1
    }
}
