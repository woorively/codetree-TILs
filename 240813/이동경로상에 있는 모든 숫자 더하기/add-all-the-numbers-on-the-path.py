n, t = tuple(map(int, input().split()))
dm = input()

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

dxs = [0, 1, 0, -1]
dys = [1, 0, -1, 0]

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

center = int(n / 2)
r, c = center, center
dr = 3
ans = grid[r][c]

for d in dm:
    if d == "L":
        dr = (dr - 1) % 4
    elif d == "R":
        dr = (dr + 1) % 4
    else:
        nx = r + dxs[dr]
        ny = c + dys[dr]
        
        if not in_range(nx, ny):
            continue
        
        r = nx
        c = ny
        ans += grid[r][c]

print(ans)