shopping_list = []
# 往购物清单里添加两个商品
shopping_list.append("键盘")
shopping_list.append("键帽")
# 往购物清单里移除一个商品
shopping_list.remove("键帽")
# 往购物清单里移除两个商品
shopping_list.append("音响")
shopping_list.append("电竞椅")
# 更改购物清单的第二个商品
shopping_list[1] = "硬盘"

# print(shopping_list)
# print(len(shopping_list))
# print(shopping_list[0])

# 定义一个价格列表
price = [799, 1024, 200, 800]
# 获取最高的价格
max_price = max(price)
# 获取最低的价格
min_price = min(price)
# 获取从低到高排序好的价格列表
sorted_price = sorted(price)
print(max_price)
print(min_price)
print(sorted_price)