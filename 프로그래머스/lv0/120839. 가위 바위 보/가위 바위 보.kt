class Solution {
    fun solution(rsp: String) = rsp.map { if (it == '2') '0' else if (it == '0') '5' else '2' }.joinToString("")
}