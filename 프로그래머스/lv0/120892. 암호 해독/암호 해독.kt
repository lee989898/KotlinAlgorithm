class Solution {
    fun solution(cipher: String, code: Int) = cipher.filterIndexed { index, _ -> (index + 1) % code == 0 }
}