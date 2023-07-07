class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        return code.indices.filter { it % q == r }.joinToString("") { code[it].toString() }
    }
}