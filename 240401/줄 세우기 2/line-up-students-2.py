n = int(input())
info = [
    (tuple(map(int, input().split())), i + 1)
    for i in range(n)
]

info.sort(key=lambda x: (x[0][0], -x[0][1]))

for elem in info:
    a, b = elem
    c, d = a
    print(c, d, b)


# class Member:
#     def __init__(self, name, height, weight):
#         self.name = name
#         self.height = height
#         self.weight = weight


# n = int(input())
# input_member = [
#     tuple(input().split())
#     for _ in range(n)
# ]

# members = [
#     Member(name, int(height), int(weight))
#     for name, height, weight in input_member
# ]

# members.sort(key=lambda x: (x.height, -x.weight))
# for member in members:
#     print(member.name, member.height, member.weight)