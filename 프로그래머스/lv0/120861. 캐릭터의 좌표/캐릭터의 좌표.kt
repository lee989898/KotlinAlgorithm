class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var (x, y) = arrayOf(0, 0)
        val (a, b) = arrayOf(board[0] / 2, board[1] / 2)
        val (c, d) = arrayOf(-(board[0] / 2), -(board[1] / 2))

        for (key in keyinput) {
            when (key) {
                "left" -> {
                    if (x - 1 >= c) {
                        x -= 1
                    }
                }
                "right" -> {
                    if (x + 1 <= a) {
                        x += 1
                    }
                }
                "up" -> {
                    if (y + 1 <= b) {
                        y += 1
                    }
                }
                "down" -> {
                    if (y - 1 >= d) {
                        y -= 1
                    }
                }
            }
        }

        return intArrayOf(x, y)
    }
}