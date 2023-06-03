import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val alphabet = Array(26) { -1 }
    val str = br.readLine().map { it - 'a' }

    for (index in str.indices) {
        if (alphabet[str[index]] == -1)
            alphabet[str[index]] = index
    }

    alphabet.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
    br.close()
}