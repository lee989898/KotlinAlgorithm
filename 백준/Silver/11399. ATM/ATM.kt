import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val atmUsingTime = br.readLine().split(" ").map { it.toInt() }.sorted()
    
    var result = 0

    for (i in atmUsingTime.indices) {
        for (j in 0..i) {
            result += atmUsingTime[j]
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    br.close()
}
