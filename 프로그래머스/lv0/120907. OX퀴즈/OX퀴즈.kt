class Solution {
    fun solution(quiz: Array<String>): List<String> {
        val answer = mutableListOf<String>()

        for (index in quiz.indices) {
            val expression = quiz[index].split(" ")
            
            if (expression[1] == "-") {
                if(expression[0].toInt() - expression[2].toInt() == expression[4].toInt())
                    answer.add("O")
                else
                    answer.add("X")
            } else {
                if (expression[0].toInt() + expression[2].toInt() == expression[4].toInt())
                    answer.add("O")
                else
                    answer.add("X")
            }
        }

        return answer
    }
}