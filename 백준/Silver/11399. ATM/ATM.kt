import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val seconds = br.readLine().split(" ").map { it.toInt() }

    var accumulateSecond = 0
    var totalTime = 0

    for (second in seconds.sorted()) {
        accumulateSecond += second
        totalTime += accumulateSecond
    }

    bw.write("$totalTime")

    bw.flush()
    bw.close()
    br.close()
}
