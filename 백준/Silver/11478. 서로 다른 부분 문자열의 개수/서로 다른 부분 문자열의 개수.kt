import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val set = mutableSetOf<String>()
    val string = readln()

    for (i in string.indices) {
        for (j in i + 1..string.length) {
            set.add(string.substring(i until j))
        }
    }

    bw.write("${set.size}")

    bw.flush()
    bw.close()
    br.close()
}

