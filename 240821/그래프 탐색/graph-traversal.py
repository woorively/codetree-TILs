n, m = tuple(map(int, input().split()))
ans = 0
graph = [
    list()
    for _ in range(n+1)
]
visited = [False] * (n+1)

for _ in range(m):
    v1, v2 = tuple(map(int, input().split()))
    graph[v1].append(v2)
    graph[v2].append(v1)

def dfs(v):
    global ans
    for c in graph[v]:
        if not visited[c]:
            visited[c] = True
            if c != 1:
                ans += 1
            dfs(c)

dfs(1)
print(ans)