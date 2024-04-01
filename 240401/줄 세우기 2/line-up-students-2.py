n = int(input())
info = [
    (input(), i + 1)
    for i in range(n)
]

info.sort(key=lambda x: (x[0], -x[1]))

for elem in info:
    a, b = elem
    print(a, b)