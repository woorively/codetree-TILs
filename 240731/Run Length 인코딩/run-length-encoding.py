str1 = input()

ans = "";
cnt = 1;
char = str1[0]

for i in range(1, len(str1)):
    if char != str1[i]:
        ans += char
        ans += str(cnt)
        cnt = 1
        char = str1[i]
    else:
        cnt += 1

ans += char
ans += str(cnt) 
print(len(ans))
print(ans)