n, m = tuple(map(int, input().split()))
map = [
    list(map(int, input().split()))
    for _ in range(n)
]

def get_gold(r, c, k):
    cnt = 0
    profit = -(k*k + (k+1)*(k+1))

    for i in range(n):
        for j in range(n):
            if abs(r-i) + abs(c-j) <= k:
                cnt += map[i][j]

    profit += cnt * m
    
    return cnt if profit >= 0 else 0

ans = 0
for r in range(n):
    for c in range(n):
        for k in range(2 * n):
            cnt = get_gold(r, c, k)

            if cnt > ans:
                ans = cnt

print(ans)