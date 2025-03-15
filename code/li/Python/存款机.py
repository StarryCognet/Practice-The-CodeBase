# 初始化余额
balance = 0

while True:
    # 显示菜单
    print("\n欢迎使用ATM存款机")
    print("1. 存款")
    print("2. 查看余额")
    print("3. 退出")

    # 获取用户选择
    choice = input("请选择操作（1/2/3）: ")

    if choice == '1':
        # 存款操作
        amount = float(input("请输入存款金额: "))
        if amount > 0:
            balance += amount
            print(f"存款成功！当前余额: {balance:.2f} 元")
        else:
            print("存款金额必须大于0！")

    elif choice == '2':
        # 查看余额
        print(f"当前余额: {balance:.2f} 元")

    elif choice == '3':
        # 退出程序
        print("感谢使用ATM存款机，再见！")
        break

    else:
        # 无效选择
        print("无效选择，请重新输入！")