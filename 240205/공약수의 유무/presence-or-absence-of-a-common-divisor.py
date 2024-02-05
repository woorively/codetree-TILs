a,b = map(int,input().split())
gong = []
for i in range(2,1920):
    if 1920 % i == 0 and 2880 % i ==0:
        gong.append(i)
sati = False
for j in range(len(gong)):
    if gong[j] >=a and gong[j] <=b:
        sati = True
if sati == True:
    print(1)
else:
    print(0)