import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val dp = Array(1_000_001) { 0 }
    dp[1] = 1
    dp[2] = 2

    for(index in 3..1_000_000) {
        dp[index] = (dp[index - 1] + dp[index - 2]) % 15746
    }

    bw.write("${dp[num]}")

    bw.flush()
    bw.close()
    br.close()
}