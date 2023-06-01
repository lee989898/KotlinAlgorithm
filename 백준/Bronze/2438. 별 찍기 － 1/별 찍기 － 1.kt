import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()

    for (i in 1..num) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }

    bw.flush()
    bw.close()
    br.close()
}