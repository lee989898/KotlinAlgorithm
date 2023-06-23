class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        
        for(index in 1..food.lastIndex) {
            val num = food[index] / 2
            repeat(num) { answer += index }
        }
        val reverse = answer.reversed()
        answer += 0
        answer += reverse
        return answer
    }
}
