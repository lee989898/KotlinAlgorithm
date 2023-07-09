import java.math.BigInteger

class Solution {
    fun solution(balls: Int, share: Int) = factorial(balls.toBigInteger()) / (factorial(balls.toBigInteger() - share.toBigInteger()) * factorial(share.toBigInteger()))
}

fun factorial(n : BigInteger): BigInteger {
    return if (n <= "1".toBigInteger())
        "1".toBigInteger()
    else
        n * factorial(n.minus("1".toBigInteger()))
}