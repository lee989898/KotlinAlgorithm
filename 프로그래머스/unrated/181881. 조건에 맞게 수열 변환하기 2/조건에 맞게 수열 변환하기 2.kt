class Solution {
    fun solution(arr: IntArray): Int {
        var prev = arr.toList()
        var i = 0

        while(true) {

            val a = prev.map { if(it % 2 == 0 && it >= 50) it / 2 else if(it % 2 != 0 && it < 50) it * 2 + 1 else it }

            if(a == prev)
                break
            prev = a
            i++
        }


        return i
    }
}