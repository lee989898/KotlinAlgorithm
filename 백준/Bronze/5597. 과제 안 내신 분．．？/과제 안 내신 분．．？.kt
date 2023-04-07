import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val students = MutableList(30) { 0 }

    repeat(28) {
        students[readln().toInt() - 1]++
    }

    students.forEachIndexed { index, student -> if (student == 0) bw.write("${index + 1}\n") }

    bw.flush()
    bw.close()
    close()
}
