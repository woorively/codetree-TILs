from collections import deque

n, m = tuple(map(int, input().split()))
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
visited = [
    [0 for _ in range(m)]
    for _ in range(n)
]
q = deque()

def in_range(x, y):
    return 0 <= x < n and 0 <= y < m

def can_go(x, y):
    # 범위에 안 맞거나, 이미 방문한 곳이거나, 뱀이 있으면
    if not in_range(x, y) or visited[x][y] or grid[x][y] == 0:
        return False
    return True

def push(x, y):
    visited[x][y] = 1
    q.append((x, y))

def bfs():
    dxs, dys = [1, -1, 0, 0], [0, 0, 1, -1]

    # 큐가 비어있을 때까지
    while q:
        x, y = q.popleft()
        for dx, dy in zip(dxs, dys):
            nx, ny = x+dx, y+dy

            if can_go(nx, ny):
                push(nx, ny)

push(0, 0)
bfs()
print(visited[n-1][m-1])