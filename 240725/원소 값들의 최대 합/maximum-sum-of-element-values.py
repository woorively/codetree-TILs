n, m = tuple(map(int, input().split()))
nums = list(map(int, input().split()))

# 5 1 4 2 3 -> 5
# 3 1 4 2 5 -> 3
# 4 1 3 2 5 -> 4
# 2 1 3 4 5
# 1 2 3 4 5

ans = 0
for num in nums:
    # 앞에서부터 확인하면서
    # 맨 앞 숫자를 원래 위치로 되돌려주기
    total = num
    # 현재 숫자를 temp 저장
    temp = num
    for _ in range(m-1):
        
        total += nums[temp - 1]
        temp = nums[temp - 1]
        
    ans = max(ans, total)


print(ans)