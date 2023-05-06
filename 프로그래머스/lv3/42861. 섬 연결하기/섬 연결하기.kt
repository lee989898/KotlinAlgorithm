import java.util.ArrayList

var parent = IntArray(101)

class Solution {

    data class Edge(val distance: Int, val nodeA: Int, val nodeB: Int) : Comparable<Edge> {

        override fun compareTo(other: Edge): Int {
            return if (this.distance < other.distance) {
                -1
            } else 1
        }
    }
    
    var edges = ArrayList<Edge>()
    var result = 0

    fun solution(n: Int, costs: Array<IntArray>): Int {
        val v = n
        val e = costs.size

        for (i in 1..v) {
            parent[i] = i
        }

        for (i in 0 until e) {
            val a = costs[i][0]
            val b = costs[i][1]
            val cost  =costs[i][2]
            edges.add(Edge(cost, a, b))
        }

        edges.sort()

        for (i in edges.indices) {
            val cost = edges[i].distance
            val a = edges[i].nodeA
            val b = edges[i].nodeB

            if (findParent(a) != findParent(b)) {
                unionParent(a, b)
                result += cost
            }
        }

        return result
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