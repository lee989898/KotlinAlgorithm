class Solution {
    fun solution(num: Int, total: Int): List<Int> {
        var start = 0
        var end = 0

        if (num < total) {
            start = 1
            end = num

            while ((start..end).toList().sum() != total) {
                start += 1
                end += 1
            }

            return (start..end).toList()
        } else {
            start = num
            end = 1

            while ((start downTo end).toList().sum() != total) {
                println((start downTo end).toList())
                
                start -= 1
                end -= 1
            }
            return (end..start).toList()
        }
    }
}