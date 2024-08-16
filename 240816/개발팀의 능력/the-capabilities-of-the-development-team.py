nums = list(map(int, input().split()))
nums.sort()

t1 = nums[-1]
t2 = nums[0] + nums[3]
t3 = nums[1] + nums[2]

ans = -1
if (t1 != t2) and (t2 != t3) and (t3 != t1):
    maxT = max(t1, t2, t3)
    minT = min(t1, t2, t3)
    
    ans = maxT - minT

print(ans)