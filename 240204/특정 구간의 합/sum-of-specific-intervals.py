n, m = tuple(map(int, input().split()))
nums = list(map(int, input().split()))

def f(a, b):
    global nums
    tot = 0

    for i in range(a - 1, b):
        tot += nums[i]

    return tot

for _ in range(m):
    a1, a2 = tuple(map(int, input().split()))
    print(f(a1, a2))