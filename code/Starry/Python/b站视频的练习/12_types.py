# 对字符串求长度
s = "Hello world!"
print(len(s))

# 通过索引获取单个字符
print(s[0])
print(s[len(s) - 1])

# 布尔类型
b1 = True
b2 = False

# 空值类型
n = None

# type函数
print(type(s))
print(type(b1))
print(type(n))
print(type(1.5))

# 不能对布尔类型的变量使用len函数，因此下面一行会报错
# len(b1)