n, m = tuple(map(int, input().split()))
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

ans = 0
for i in range(n-1):
    for j in range(m-1):
        num_min = min(grid[i][j], grid[i][j+1], grid[i+1][j] ,grid[i+1][j+1])
        total = grid[i][j] + grid[i][j+1] + grid[i+1][j] + grid[i+1][j+1] - num_min
        ans = max(ans, total)

for i in range(n):
    for j in range(m-2):
        total = grid[i][j] + grid[i][j+1] + grid[i][j+2]
        ans = max(ans, total)

for i in range(n-2):
    for j in range(m):
        total = grid[i][j] + grid[i+1][j] + grid[i+2][j]
        ans = max(ans, total)

print(ans)