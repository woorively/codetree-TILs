import sys

n = int(input())
nums = list(map(int, input().split()))

ans = -sys.maxsize
total = 0
for n in nums:
    total += n
    ans = max(ans, total)
    if total <= 0:
        total = 0

print(ans)