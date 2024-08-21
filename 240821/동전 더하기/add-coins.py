n, k = tuple(map(int, input().split()))
coins = [
    int(input())
    for _ in range(n)
]

ans = 0
i = len(coins) - 1
while k != 0:
    if coins[i] <= k:
        while coins[i] <= k:
            ans += 1
            k -= coins[i]
    i -= 1

print(ans)