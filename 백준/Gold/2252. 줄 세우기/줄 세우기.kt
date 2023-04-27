import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

var graph = ArrayList<ArrayList<Int>>()
val indegree = IntArray(100001)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (N, M) = br.readLine().split(" ").map { it.toInt() }

    repeat(N + 1) {
        graph.add(ArrayList())
    }

    repeat(M) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        indegree[b] += 1
    }

    topologySort(N)

    bw.flush()
    bw.close()
    br.close()
}

fun topologySort(n: Int) {
    val result = ArrayList<Int>()
    val q : Queue<Int> = LinkedList()

    for (i in 1..n) {
        if (indegree[i] == 0) {
            q.offer(i)
        }
    }

    while (!q.isEmpty()) {
        val now = q.poll()
        result.add(now)

        for (i in graph[now].indices) {
            indegree[graph[now][i]] -= 1

            if (indegree[graph[now][i]] == 0) {
                q.offer(graph[now][i])
            }
        }
    }

    result.forEach { print("$it ") }
}