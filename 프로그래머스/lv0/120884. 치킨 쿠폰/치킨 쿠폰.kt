class Solution {
    fun solution(chicken: Int): Int {
        var coupon = chicken
        var answer = 0

        while (coupon > 9) {
            answer += (coupon / 10)
            val serviceChicken = (coupon / 10)
            val leftCoupon = (coupon % 10)
            coupon = leftCoupon + serviceChicken
        }

        return answer
    }
}