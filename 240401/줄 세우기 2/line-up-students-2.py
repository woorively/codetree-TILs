n = int(input())
info = [
    (input(), i + 1)
    for i in range(n)
]

info.sort()
for elem in info:
    a, b = elem
    print(a, b)