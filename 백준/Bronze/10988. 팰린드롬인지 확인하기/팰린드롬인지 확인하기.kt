import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()

    if (palindrome(str)) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()
    br.close()
}

fun palindrome(str: String): Boolean {
    if (str.length <= 1)
        return true

    return if (str[0] == str[str.lastIndex])
        palindrome(str.substring(1 until str.lastIndex))
    else
        false
}