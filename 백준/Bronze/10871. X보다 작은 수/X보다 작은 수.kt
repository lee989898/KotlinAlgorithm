import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stringTokenizer = StringTokenizer(readln(), " ")
    val N = stringTokenizer.nextToken().toInt()
    val X = stringTokenizer.nextToken().toInt()
    val nums = mutableListOf<Int>()

    val num = StringTokenizer(readln(), " ")
    while (num.hasMoreTokens()) {
        nums.add(num.nextToken().toInt())
    }

    nums.forEach { if (it < X) bw.write("$it ") }
    
    bw.flush()
    bw.close()
    close()
}
