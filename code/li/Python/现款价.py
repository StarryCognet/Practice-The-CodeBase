# 初始化账户信息
accounts = {
    "user1": {"password": "1234", "balance": 1000.0, "transactions": []},
    "user2": {"password": "5678", "balance": 500.0, "transactions": []},
}

# 当前登录用户
current_user = None

def login():
    global current_user
    username = input("请输入用户名: ")
    password = input("请输入密码: ")

    if username in accounts and accounts[username]["password"] == password:
        current_user = username
        print(f"登录成功！欢迎回来，{username}。")
    else:
        print("用户名或密码错误，请重试。")

def deposit():
    amount = float(input("请输入存款金额: "))
    if amount > 0:
        accounts[current_user]["balance"] += amount
        accounts[current_user]["transactions"].append(f"存款: +{amount:.2f} 元")
        print(f"存款成功！当前余额: {accounts[current_user]['balance']:.2f} 元")
    else:
        print("存款金额必须大于0！")

def withdraw():
    amount = float(input("请输入取款金额: "))
    if amount > 0:
        if amount <= accounts[current_user]["balance"]:
            accounts[current_user]["balance"] -= amount
            accounts[current_user]["transactions"].append(f"取款: -{amount:.2f} 元")
            print(f"取款成功！当前余额: {accounts[current_user]['balance']:.2f} 元")
        else:
            print("余额不足，无法取款！")
    else:
        print("取款金额必须大于0！")

def transfer():
    target_user = input("请输入转账目标用户名: ")
    if target_user in accounts:
        amount = float(input("请输入转账金额: "))
        if amount > 0:
            if amount <= accounts[current_user]["balance"]:
                accounts[current_user]["balance"] -= amount
                accounts[target_user]["balance"] += amount
                accounts[current_user]["transactions"].append(f"转账给 {target_user}: -{amount:.2f} 元")
                accounts[target_user]["transactions"].append(f"收到来自 {current_user} 的转账: +{amount:.2f} 元")
                print(f"转账成功！当前余额: {accounts[current_user]['balance']:.2f} 元")
            else:
                print("余额不足，无法转账！")
        else:
            print("转账金额必须大于0！")
    else:
        print("目标用户不存在！")

def view_balance():
    print(f"当前余额: {accounts[current_user]['balance']:.2f} 元")

def view_transactions():
    print("\n交易记录:")
    for transaction in accounts[current_user]["transactions"]:
        print(transaction)

def logout():
    global current_user
    current_user = None
    print("已退出登录。")

# 主程序
while True:
    if current_user is None:
        print("\n欢迎使用高级ATM存款机")
        print("1. 登录")
        print("2. 退出系统")
        choice = input("请选择操作（1/2）: ")

        if choice == '1':
            login()
        elif choice == '2':
            print("感谢使用，再见！")
            break
        else:
            print("无效选择，请重试！")
    else:
        print("\n欢迎使用高级ATM存款机")
        print("1. 存款")
        print("2. 取款")
        print("3. 转账")
        print("4. 查看余额")
        print("5. 查看交易记录")
        print("6. 退出登录")
        choice = input("请选择操作（1/2/3/4/5/6）: ")

        if choice == '1':
            deposit()
        elif choice == '2':
            withdraw()
        elif choice == '3':
            transfer()
        elif choice == '4':
            view_balance()
        elif choice == '5':
            view_transactions()
        elif choice == '6':
            logout()
        else:
            print("无效选择，请重试！")