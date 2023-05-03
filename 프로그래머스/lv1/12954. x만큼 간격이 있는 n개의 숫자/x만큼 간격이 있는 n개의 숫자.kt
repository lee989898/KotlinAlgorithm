import kotlin.math.abs

class Solution {
    fun solution(x: Int, n: Int) = if (x < 0) (x downTo (x * n.toLong()) step abs(x.toLong())).toList()
    else if(x > 0) (x..(x * n.toLong()) step x.toLong()).toList()
    else List(n) { 0 }
}