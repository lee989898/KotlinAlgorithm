import kotlin.math.*

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var (w, h) = listOf(0, 0)
        
        for(size in sizes) {
            val (width, height) = listOf(max(size[0], size[1]), min(size[0], size[1]))
            w = max(width, w)
            h = max(height, h)
        }

        return w * h
    }
}
