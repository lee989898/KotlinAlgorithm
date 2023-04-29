class Solution {
    fun solution(cipher: String, code: Int) = cipher.filterIndexed { index, c -> (index + 1) % code  == 0 }
}