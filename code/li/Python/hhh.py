import numpy as np
import matplotlib.pyplot as plt

# 生成爱心的参数方程
t = np.linspace(0, 2 * np.pi, 1000)  # 参数 t 从 0 到 2π
x = 16 * np.sin(t)**3  # x 坐标
y = 13 * np.cos(t) - 5 * np.cos(2*t) - 2 * np.cos(3*t) - np.cos(4*t)  # y 坐标

# 绘制爱心
plt.figure(figsize=(6, 6))  # 设置画布大小
plt.plot(x, y, color='red', linewidth=2)  # 绘制红色爱心
plt.fill(x, y, color='red')  # 填充颜色
plt.title("Heart Shape")  # 添加标题
plt.axis('equal')  # 设置坐标轴比例相等
plt.show()  # 显示图形