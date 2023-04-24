import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val sortedArr = list.distinct().sorted()
    for(i in 0 until num) {
        bw.write("${sortedArr.binarySearch(list[i])} ")
    }

    bw.flush()
    bw.close()
    close()
}
