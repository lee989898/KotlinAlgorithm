class Solution {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) { 0 } }
        var (x, y) = arrayOf(0, 0)
        var i = 1
        val dx = arrayOf(1, -1, 0, 0)
        val dy = arrayOf(0, 0, 1, -1)
        var current = "right"
        answer[0][0] = 1

        while (i < n * n) {
            if (current == "right") {
                if (y + dy[2] < n && answer[x][y + dy[2]] == 0) {
                    y += dy[2]
                    answer[x][y] = ++i
                } else {
                    current = "down"
                }
            } else if (current == "down") {
                if (x + dx[0] < n && answer[x + dx[0]][y] == 0) {
                    x += dx[0]
                    answer[x][y] = ++i
                } else {
                    current = "left"
                }
            } else if (current == "left") {
                if (y + dy[3] > -1 && answer[x][y + dy[3]] == 0) {
                    y += dy[3]
                    answer[x][y] = ++i
                } else {
                    current = "up"
                }
            } else {
                if (x + dx[1] > -1 && answer[x + dx[1]][y] == 0) {
                    x += dx[1]
                    answer[x][y] = ++i
                } else {
                    current = "right"
                }
            }
        }
        return answer
    }
}