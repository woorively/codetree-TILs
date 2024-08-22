MAX_INT = 1000
dp = [0] * (MAX_INT+1)

n = int(input())
dp[0] = 1
dp[1] = 0
dp[2] = 1
dp[3] = 1

for i in range(4, n+1):
    dp[i] = (dp[i-2] + dp[i-3]) % 10007

print(dp[n])