import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = abs(array[0] - n)
        var i = 101

        for (index in array.indices) {
            if (answer > abs(array[index] - n)) {
                    answer = abs(array[index] - n)
                    i = array[index]
            } else if(answer == abs(array[index] - n)) {
                if(i > array[index]) {
                    answer = abs(array[index] - n)
                    i = array[index]
                }
            }
        }

        return i
    }
}