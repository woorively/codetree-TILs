a, b = tuple(map(int, input().split()))

def f(n, m):
    if n > m:
        m += 10
        n *= 2
    else:
        n += 10
        m *= 2
    return n, m

a, b = f(a, b)
print(a, b)