class Solution {
    fun solution(price: Int): Int = when (price) {
        in 100000 until 300000 -> price - price * 0.05
        in 300000 until 500000 -> price - price * 0.1
        in 500000..1000000 -> price - price * 0.2
        else -> price
    }.toInt()
}