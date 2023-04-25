import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readln().toInt()

    repeat(num) {
        val (r, n) = readln().split(" ").map { it.toInt() }

        bw.write("${factorial(n) / (factorial(n - r) * factorial(r))}\n")
    }

    bw.flush()
    bw.close()
    close()
}

fun factorial(n: Int) : BigInteger {
    var num = BigInteger("1")

    for (i in 1..n) {
        num *= BigInteger("$i")
    }
    return num
}
