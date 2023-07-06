class Solution {
    fun solution(denum1: Int, num1: Int, denum2: Int, num2: Int): IntArray {
        val denum3 = (num1 * denum2) + (num2 * denum1)
        val num3 = num1 * num2
        var gcd = 1

        for (i in 1..denum3) {
            if (denum3 % i == 0 && num3 % i == 0) {
                gcd = i
            }
        }

        return intArrayOf(denum3 / gcd, num3 / gcd)
    }
}
