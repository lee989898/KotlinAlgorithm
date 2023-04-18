import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray().sorted()

    val num2 = br.readLine().toInt()
    val arr2 = br.readLine().split(" ").map { it.toInt() }

    for (i in arr2) {
        if (arr.binarySearch(i) >= 0) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}