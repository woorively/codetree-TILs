n = int(input())
nums = list(map(int, input().split()))

for _ in range(n):
    for i in range(n-1):
        if nums[i+1] < nums[i]:
            tmp = nums[i]
            nums[i] = nums[i+1]
            nums[i+1] = tmp

for num in nums:
    print(num, end=" ")