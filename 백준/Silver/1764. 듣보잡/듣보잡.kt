import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var stringTokenizer = StringTokenizer(readln(), " ")

    val unHeardNum = stringTokenizer.nextToken().toInt()
    val unReportedNum = stringTokenizer.nextToken().toInt()

    val unHeardOf = mutableSetOf<String>()
    val unReportedOf = mutableSetOf<String>()

    repeat(unHeardNum) {
        unHeardOf.add(StringTokenizer(readln()).nextToken())
    }

    repeat(unReportedNum) {
        unReportedOf.add(StringTokenizer(readln()).nextToken())
    }

    val total = unHeardOf.intersect(unReportedOf).sorted()

    bw.write("${total.size}\n")
    total.forEach { bw.write("$it\n") }

    bw.flush()
    bw.close()
    close()
}
