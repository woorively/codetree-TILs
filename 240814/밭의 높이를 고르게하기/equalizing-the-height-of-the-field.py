import sys

n, h, t = tuple(map(int, input().split()))
height = list(map(int, input().split()))

ans = sys.maxsize

for i in range(n-t+1):
    tmp = 0
    for j in range(i, i + t):
        tmp += abs(height[j] - h)
    ans = min(ans, tmp)

print(ans)