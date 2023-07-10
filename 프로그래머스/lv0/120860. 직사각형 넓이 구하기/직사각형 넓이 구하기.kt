class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var maxX = dots[0][0]
        var maxY = dots[0][1]
        var minX = dots[0][0]
        var minY = dots[0][1]
        
        for (i in dots.indices) {
            if(maxX < dots[i][0]) {
                maxX = dots[i][0]
            }
            if (minX > dots[i][0]) {
                minX = dots[i][0]
            }
        }
        
        for (i in  dots.indices) {
            if(maxY < dots[i][1]) {
                maxY = dots[i][1]
            }
            if (minY > dots[i][1]) {
                minY = dots[i][1]
            }
        }

        return (maxX - minX) * (maxY - minY)
    }
}