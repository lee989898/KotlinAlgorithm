import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }

    val sortedList = list.distinct().sorted()

    for (element in list) {
        bw.write("${sortedList.binarySearch(element)} ")
    }

    bw.flush()
    bw.close()
    close()
}
