import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.ArrayList

data class Edge(val distance: Int, val nodeA: Int, val nodeB: Int) : Comparable<Edge> {

    override fun compareTo(other: Edge): Int {
        return if (this.distance < other.distance) {
            -1
        } else 1
    }
}

fun findParent(x: Int): Int {
    return if (x == parent[x]) x else findParent(parent[x]).also { parent[x] = it }
}

fun unionParent(_a: Int, _b: Int) {
    var a = _a
    var b = _b
    a = findParent(a)
    b = findParent(b)
    if (a < b) parent[b] = a else parent[a] = b
}


var v = 0
var e = 0
var parent = IntArray(100001)

var edges = ArrayList<Edge>()
var result = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    v = br.readLine().toInt()
    e = br.readLine().toInt()

    for (i in 1..v) {
        parent[i] = i
    }

    for (i in 0 until e) {
        val (a, b, cost) = br.readLine().split(" ").map { it.toInt() }
        edges.add(Edge(cost, a, b))
    }

    edges.sort()

    for (i in edges.indices) {
        val cost = edges[i].distance
        val a = edges[i].nodeA
        val b = edges[i].nodeB
        // 사이클이 발생하지 않는 경우에만 집합에 포함
        if (findParent(a) != findParent(b)) {
            unionParent(a, b)
            result += cost
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    br.close()
}
