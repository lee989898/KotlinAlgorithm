import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nums = mutableListOf<Int>()

    repeat(9) {
        nums.add(StringTokenizer(readln()).nextToken().toInt())
    }
    val max = nums.max()

    nums.forEachIndexed { index, num -> if (num == max) bw.write("$max\n${index+1}") }

    bw.flush()
    bw.close()
    close()
}
