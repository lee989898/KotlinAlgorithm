import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = readln().split(" ").map { it.toInt() }

    val A = readln().split(" ").map { it.toInt() }.toSet()
    val B = readln().split(" ").map { it.toInt() }.toSet()

    bw.write("${A.subtract(B).size + B.subtract(A).size}")

    bw.flush()
    bw.close()
    close()
}
