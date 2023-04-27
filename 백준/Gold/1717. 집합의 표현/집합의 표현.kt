import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val parent = IntArray(1000001)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (v, e) = readln().split(" ").map { it.toInt() }

    for (i in 1..v) {
        parent[i] = i
    }

    repeat(e) {
        val (n, a, b) = readln().split(" ").map { it.toInt() }

        if (n == 0) {
            unionParent2(a, b)
        } else {
            if (findParent(a) == findParent(b)) {
                bw.write("YES\n")
            } else {
                bw.write("NO\n")
            }
        }

    }

    bw.flush()
    bw.close()
    close()
}

fun findParent(x: Int): Int {
    return if (x == parent[x]) x else findParent(parent[x]).also { parent[x] = it }
}

fun unionParent2(_a: Int, _b: Int) {
    var a = _a
    var b = _b
    a = findParent(a)
    b = findParent(b)
    if (a < b) parent[b] = a else parent[a] = b
}