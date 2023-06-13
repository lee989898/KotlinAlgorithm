from collections import deque

n, m, v = map(int, input().split())

graph = [[] * (n + 1) for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

dfs_visited = [False] * (n + 1)
bfs_visited = [False] * (n + 1)


def dfs(graph, start, visited):
    visited[start] = True
    print(start, end=' ')

    graph[start].sort()

    for i in graph[start]:
        if not visited[i]:
            dfs(graph, i, visited)


def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True

    while queue:
        data = queue.popleft()
        print(data, end=' ')
        graph[data].sort()
        for i in graph[data]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True


dfs(graph, v, dfs_visited)
print()
bfs(graph, v, bfs_visited)
