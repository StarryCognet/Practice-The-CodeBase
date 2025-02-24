# 需自行创建data.txt文件，并放在和此代码文件同一目录下，才能读出内容
# 也可以自行更改文件路径

# 1. read方法读文件
with open("./data.txt", "r", encoding="utf-8") as f:
    content = f.read()
    print(content)

# 2. readline方法读文件
with open("./data.txt", "r", encoding="utf-8") as f:
    line = f.readline()
    while line != "":
        print(line)
        line = f.readline()

# 3. readlines方法读文件
with open("./data.txt", "r", encoding="utf-8") as f:
    lines = f.readlines()
    for line in lines:
        print(line)
