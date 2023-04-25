import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readln().toInt()
    val cnt = IntArray(10001) { 0 }
    
    repeat(num) {
        cnt[readln().toInt()]++
    }

    for (index in cnt.indices) {
        bw.write("${index}\n".repeat(cnt[index]))
    }
    
    bw.flush()
    bw.close()
    close()
}
