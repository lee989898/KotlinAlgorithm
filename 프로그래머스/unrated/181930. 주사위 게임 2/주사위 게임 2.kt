class Solution {
    fun solution(a: Int, b: Int, c: Int) = if(a == b && b == c) (a + b + c) * (a.pow() + b.pow() + c.pow()) * (a.pow(3) + b.pow(3) + c.pow(3)) else if(a != b && b != c && a != c) a + b + c else (a + b + c) * (a.pow() + b.pow() + c.pow())
}

fun Int.pow() = this * this

fun Int.pow(num: Int) = this * this * this