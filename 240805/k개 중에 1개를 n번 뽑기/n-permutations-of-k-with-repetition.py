k, n = tuple(map(int, input().split()))
ans = []

def choose(curr_num):
    if curr_num == n:
        for e in ans:
            print(e, end=" ")
        print()
        return

    for i in range(1, k+1):
        ans.append(i)
        choose(curr_num + 1)
        ans.pop()

    return

choose(0)