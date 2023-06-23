class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size) { 0 }
        for((i, command) in commands.withIndex()) {
            val array = array.slice(command[0] - 1 until command[1])
            answer[i] = array.sorted()[command[2] - 1]
        }
        return answer
    }
}
