class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var current = 0

        if (numbers.size % 2 == 0) {
            for (i in 1..k) {
                if (current + 2 >= numbers.size) {
                    current = 0
                } else {
                    current += 2
                }
            }

            if (current == 0) {
                current = numbers.lastIndex - 1
            } else {
                current = current - 2
            }
        } else {
            for (i in 1..k) {
                if (current == numbers.size - 1) {
                    current = 1
                } else if (current + 2 >= numbers.size) {
                    current = 0
                } else {
                    current += 2
                }
            }

            if (current == 0) {
                current = numbers.lastIndex - 1
            } else if (current == 1) {
                current = numbers.lastIndex
            } else {
                current = current - 2
            }
        }

        return numbers[current]
    }
}