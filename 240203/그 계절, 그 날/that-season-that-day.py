y, m, d = tuple(map(int, input().split()))

def leaf_year(y):
    if y % 4:
        return False
    else:
        if y % 100 == 0 and y % 400 == 0:
            return True
        elif y % 100 == 0 and y % 400 != 0:
            return False
        else:
            return True

if m == 2 and d == 29 and not leaf_year(y):
    print(-1)
else:
    if m in (12, 1, 2):
        print("Winter")
    elif m in (3, 4, 5):
        print("Spring")
    elif m in (6, 7, 8):
        print("Summer")
    else:
        print("Fall")