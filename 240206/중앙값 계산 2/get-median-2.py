n = int(input())
nums = map(int, input().split())

def center(lst):
    s = []
    i = 0
    for e in lst:
        s.append(e)
        if len(s) % 2:
            s.sort()
            print(s[i], end=" ")
            i += 1

center(nums)
    

# 1 -> 1
# 3 -> 2
# 5 -> 3
# 7 -> 4