class Solution {
    fun solution(slice: Int, n: Int) = n / slice + if(n % slice == 0) 0 else 1
}