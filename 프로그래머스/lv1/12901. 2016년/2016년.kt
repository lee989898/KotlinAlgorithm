class Solution {
    fun solution(a: Int, b: Int) =
        when ((a * 30 + b + 2 +
                if (a == 1 || a == 3) 0
                else if (a == 2 || a == 4 || a == 5) 1
                else if (a == 6 || a == 7) 2
                else if (a == 8) 3
                else if (a == 9 || a == 10) 4
                else 5) % 7
        ) {
            1 -> "MON"
            2 -> "TUE"
            3 -> "WED"
            4 -> "THU"
            5 -> "FRI"
            6 -> "SAT"
            else -> "SUN"
        }
}
