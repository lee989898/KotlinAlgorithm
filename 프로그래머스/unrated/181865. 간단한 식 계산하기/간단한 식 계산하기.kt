class Solution {
    fun solution(binomial: String): Long {
        val (a, b, c) = binomial.split(" ")
        return if (b == "+") {
            a.toLong() + c.toLong()
        } else if (b == "-") {
            a.toLong() - c.toLong()
        } else {
            a.toLong() * c.toLong()
        }
    }
}