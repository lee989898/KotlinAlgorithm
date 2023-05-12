import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val graph = ArrayList<ArrayList<Int>>()
val visited = BooleanArray(101)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val computerNum = br.readLine().toInt()
    val pairs = br.readLine().toInt()


    repeat(computerNum + 1) {
        graph.add(ArrayList())
    }

    repeat(pairs) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[a] += b
        graph[b] += a
    }

    dfs(1)

    bw.write("${visited.count { it } - 1}")

    bw.flush()
    bw.close()
    br.close()
}

fun dfs(x: Int) {
    visited[x] = true

    for (i in graph[x].indices) {
        val y = graph[x][i]
        if (!visited[y]) dfs(y)
    }
}
