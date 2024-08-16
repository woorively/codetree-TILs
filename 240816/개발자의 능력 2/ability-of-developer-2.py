nums = list(map(int, input().split()))
nums.sort()

team1 = nums[0] + nums[5]
team2 = nums[1] + nums[4]
team3 = nums[2] + nums[3]

maxNum = max(team1, team2, team3)
minNum = min(team1, team2, team3)

print(maxNum - minNum)