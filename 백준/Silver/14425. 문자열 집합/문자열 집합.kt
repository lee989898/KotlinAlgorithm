import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var reuslt = 0
    val (N, M) = readln().split(" ").map { it.toInt() }

    val listN = List(N){ readln() }.sorted()
    val listM = List(M) { readln() }

    for (word in listM) {
        if(listN.binarySearch(word) >= 0)
            reuslt++
    }

    bw.write("$reuslt")

    bw.flush()
    bw.close()
    close()
}
