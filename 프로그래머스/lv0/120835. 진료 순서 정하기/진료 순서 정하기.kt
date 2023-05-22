class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in emergency.indices) {
            var e = 1
            for (element in emergency.sortedDescending()) {
                if (emergency[i] == element)
                    answer += e
                ++e
            }
        }

        return answer
    }
}   