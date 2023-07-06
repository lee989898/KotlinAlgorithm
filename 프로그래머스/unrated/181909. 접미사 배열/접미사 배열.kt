class Solution {
    fun solution(myString: String) = myString.indices.map(myString::substring).sorted()
}
