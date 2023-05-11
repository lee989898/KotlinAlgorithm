class Solution {
    fun solution(strArr: Array<String>): Int {
        val arrayList = MutableList(31) { 0 }
        strArr.forEach { arrayList[it.length]++ }
        return arrayList.maxOrNull()!!
    }
}