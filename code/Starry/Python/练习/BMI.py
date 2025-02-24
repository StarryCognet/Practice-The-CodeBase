def getcmd(wi, hi):
    BMI = wi / hi**2
    if BMI <= 18.5:
        crd = "偏瘦"
    elif BMI <= 24:
        crd = "正常"
    elif BMI <= 28:
        crd = "偏胖"
    else:
        crd = "肥胖"
    print(f"BMI指数为：{crd}{BMI}")


搞 = float(input("请输入身高："))
w = float(input("请输入体重："))
getcmd(w, h)
