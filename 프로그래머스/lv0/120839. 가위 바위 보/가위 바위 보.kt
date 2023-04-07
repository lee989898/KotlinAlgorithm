class Solution {
    fun solution(rsp: String) = rsp.map { if (it.digitToInt() == 2) 0 else if (it.digitToInt() == 0) 5 else 2 }.joinToString("")
}