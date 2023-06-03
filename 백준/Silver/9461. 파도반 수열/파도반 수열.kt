import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val case = br.readLine().toInt()
    repeat(case) {
        val n = br.readLine().toInt()
        val dp = Array(n + 1) { 0L }

        if (n == 1) {
            bw.write("${1}\n")
        } else if (n == 2) {
            bw.write("${1}\n")
        } else if (n == 3) {
            bw.write("${1}\n")
        }

        if (n > 3) {
            dp[1] = 1
            dp[2] = 1
            dp[3] = 1

            for (index in 4..n) {
                dp[index] = dp[index - 2] + dp[index - 3]
            }
            bw.write("${dp[n]}\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}