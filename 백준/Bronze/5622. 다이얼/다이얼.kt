import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dial = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    val str = br.readLine()
    var sum = 0

    for (char in str) {
        for (index in dial.indices) {
            if (dial[index].contains(char)) {
                sum += index + 3
                break
            }
        }
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    br.close()
}