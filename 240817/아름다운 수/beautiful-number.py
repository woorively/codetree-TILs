n = int(input())
ans = 0
seq = list()

def is_beautiful():
    idx = 0
    while idx < n:
        if idx + seq[idx] - 1 >= n:
            return False

        for i in range(idx, idx + seq[idx]):
            if (seq[i] != seq[idx]):
                return False
        
        idx += seq[idx]

    return True

def calc(cnt):
    global ans;

    if cnt == n:
        if is_beautiful():
            ans += 1

        return

    for i in range(1, 5):
        seq.append(i)
        calc(cnt + 1)
        seq.pop()

calc(0)
print(ans)