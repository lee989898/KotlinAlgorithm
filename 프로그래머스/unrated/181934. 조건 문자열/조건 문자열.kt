class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int) = when {
        ineq == "<" && eq == "=" -> n <= m
        ineq == ">" && eq == "=" -> n >= m
        ineq == "<" && eq == "!" -> n < m        
        else -> n > m
    }.let { if(it) 1 else 0 }
}