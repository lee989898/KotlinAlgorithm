import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var n: Int = 0
var nList = listOf<Int>()
var m: Int = 0
var mList = listOf<Int>()
var sortedNList = listOf<Int>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    n = br.readLine().toInt()
    nList = br.readLine().split(" ").map { it.toInt() }
    m = br.readLine().toInt()
    mList = br.readLine().split(" ").map { it.toInt() }
    sortedNList = nList.sorted()

    for (item in mList) {
        if (binarySearch(item, 0, n - 1)) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}

fun binarySearch(value: Int, start: Int, end: Int): Boolean {
    if (start > end) {
        return false
    }

    val medium = (start + end) / 2
    return if (value < sortedNList[medium]) {
        binarySearch(value, start, medium - 1)
    } else if (value > sortedNList[medium]) {
        binarySearch(value, medium + 1, end)
    } else {
        true
    }
}
