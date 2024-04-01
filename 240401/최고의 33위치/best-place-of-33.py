n = int(input())
grid = [
    tuple(map(int, input().split()))
    for _ in range(n)
]

def calc(row, col):
    cnt = 0
    for i in range(row, row + 3):
        for j in range(col, col + 3):
            cnt += grid[i][j]
    return cnt
            

ans = 0
for row in range(n):
    for col in range(n):
        if col + 2 >= n or row + 2 >= n:
            continue
        
        ans = max(ans, calc(row, col))

print(ans)