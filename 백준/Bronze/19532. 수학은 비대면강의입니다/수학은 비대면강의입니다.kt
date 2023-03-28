import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stringTokenizer = StringTokenizer(readLine(), " ")
    val a = stringTokenizer.nextToken().toInt()
    val b = stringTokenizer.nextToken().toInt()
    val c = stringTokenizer.nextToken().toInt()
    val d = stringTokenizer.nextToken().toInt()
    val e = stringTokenizer.nextToken().toInt()
    val f = stringTokenizer.nextToken().toInt()

    var flag = 0
    var x = 0
    var y = 0

    for (i in -999..999) {
        for (j in -999..999) {
            if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                x = i
                y = j
                flag = 1
                break
            }
        }
        if (flag == 1)
            break
    }

    print("$x $y")
}
