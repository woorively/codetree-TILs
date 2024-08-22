n = int(input())
MAX_INT = 45
f = [0] * (MAX_INT + 1)

f[1] = 1
f[2] = 1
for i in range(3, n+1):
    f[i] = f[i-1] + f[i-2]

print(f[n])