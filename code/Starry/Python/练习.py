name=input("输入你的名字")
tz=input("输入你攻击力")
print("你的初始攻击力是"+tz)
gjl=tz
zj=input("现在你可以增加你捡到了一个道具可加20攻击力,点y确定n否定")

if zj=="y":
    print(name+"你的攻击力是"+str(int(gjl)+20))
elif zj=="n":
    print(name+"傻逼白给的都不捡")


gjl=str(int(gjl)+20)
gjll=int(gjl)+20
input("回车继续")
print("好了现在你遇到了一只哥布林，需要你打到他")
print("哥布林：哈哈，我是哥布林，哇哦！！")
print("你的攻击力:"+gjl+"\n哥布林的生命值:100")
qq=input("是否对战？是,请按y否请按n")
if qq=="y" and gjll>=100:
    print("您打过了,NB")
else : 
    print("弱鸡")

if qq=="n":
    print("你捡回了一条命")

print("游戏结束")