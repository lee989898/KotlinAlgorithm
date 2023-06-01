import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val total = br.readLine().toInt()
    val case = br.readLine().toInt()
    var sum = 0
    
    repeat(case) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        sum += a * b
    }
    
    if (total == sum)
        bw.write("Yes")
    else
        bw.write("No")
    
    bw.flush()
    bw.close()
    br.close()
}