import java.io.*

val parent = IntArray(1000001) { it }

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (v, e) = br.readLine().split(" ").map(String::toInt)

    repeat(e) {
        val (n, a, b) = br.readLine().split(" ").map(String::toInt)

        if (n == 0) {
            union(a, b)
        } else {
            bw.write(if (find(a) == find(b)) "YES\n" else "NO\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}

fun find(x: Int): Int {
    return if (x == parent[x]) x else {
        parent[x] = find(parent[x])
        parent[x]
    }
}

fun union(a: Int, b: Int) {
    parent[find(b)] = find(a)
}