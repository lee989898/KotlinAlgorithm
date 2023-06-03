import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = br.readLine().toInt()

    repeat(count) {
        val (num, str) = br.readLine().split(" ")

        for (index in str.indices) {
            repeat(num.toInt()) {
                bw.write("${str[index]}")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    br.close()
}