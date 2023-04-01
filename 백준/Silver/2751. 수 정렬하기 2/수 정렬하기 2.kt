import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val bw = System.out.bufferedWriter()

    val numList = mutableListOf<Int>()

    var stringTokenizer = StringTokenizer(readln(), " ")
    repeat(stringTokenizer.nextToken().toInt()) {
       stringTokenizer = StringTokenizer(readln(), " ")
       numList.add(stringTokenizer.nextToken().toInt())
    }

    val numSort = numList.sorted()
    for (element in numSort) {
        bw.write("${element}\n")
    }
    bw.close()
    this.close()
}