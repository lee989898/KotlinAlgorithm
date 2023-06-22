class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var total = 0L
        
        for (i in price..price * count step price) {
            total += i
        }
        
        if (total > money) {
            return total - money 
        } else {
            return 0
        }
    }
}