print("ffff")
i=0
while i<50000:
    print('jjjjj'+str(i)+'')
    i = i + 1
for i in range(0,160):
    print(i)
    print("feng")
import random, sys
print("石头剪刀布")
w=0
l=0
t=0
while True:
    print("石头 剪刀和布")
    while True:
        print("游戏规则")
        ksyx=input()
        if ksyx=="q":
            sys.exit()
         if ksyx=="r" or ksyx=="p" or ksyx=="s":
            break
        print("请输入")