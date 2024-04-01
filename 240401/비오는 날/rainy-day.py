n = int(input())
data = [
    input()
    for _ in range(n)
]

data.sort()
for elem in data:
    if 'Rain' in elem:
        print(elem)
        break