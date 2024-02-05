# 변수 선언 및 입력:
n = int(input())

def print_star(n):
    if n == 0:
        return
    print("* " * n)
    print_star(n - 1)
    print("* " * n)


print_star(n)