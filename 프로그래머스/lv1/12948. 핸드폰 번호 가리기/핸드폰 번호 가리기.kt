class Solution {
    fun solution(phone_number: String) = phone_number.mapIndexed { idx, c -> if(idx < phone_number.length - 4) '*' else c }.joinToString("")
}