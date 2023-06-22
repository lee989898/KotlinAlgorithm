class Solution {
    fun solution(price: Int, money: Int, count: Int) = (1..count).map { it * price.toLong() }.sum().let { if(money > it) 0 else it - money }
}
