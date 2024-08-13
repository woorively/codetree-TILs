import sys

n, s = tuple(map(int, input().split()))
nums = list(map(int, input().split()))

total = 0
for num in nums:
    total += num

ans = sys.maxsize
for i in range(len(nums)-1):
    for j in range(i+1, len(nums)):
        temp = total
        temp -= (nums[i] + nums[j])
        ans = min(ans, abs(temp - s))

print(ans)