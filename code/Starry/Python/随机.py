import random, sys
print("随机暴击测试，按s攻击\n哥布林生命值为100\n初始攻击力为1\n暴击攻击力翻2倍")
gbl=100
def kaishi():
  print("攻击一次，触发暴击\n哥布林血量为："+str(int(gbl)-2))
  gbl=gbl-2
while True:  
     sjs=random.randint(1,10)
     ks=""
     while ks!="s" and gbl<100:
        ks=input("按s攻击")
        if sjs==1:
          print(kaishi())
        else:
          print("攻击一次\n哥布林血量为："+str(int(gbl)-1))
          break