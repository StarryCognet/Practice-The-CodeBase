import os
import requests
from urllib.parse import quote
from bs4 import BeautifulSoup

# 设置保存图片的文件夹
folder_path = "images"
if not os.path.exists(folder_path):
    os.makedirs(folder_path)

url = "https://movie.douban.com/top250?start=0&filter="
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3"
}

response = requests.get(quote(url, safe=':/'), headers=headers)
soup = BeautifulSoup(response.text, 'html.parser')

# 查找所有的img标签
img_tags = soup.find_all('img')

for i, img_tag in enumerate(img_tags):
    # 获取图片的URL
    img_url = img_tag.get('src')
    if not img_url:
        img_url = img_tag.get('data-original')
    if img_url:
        try:
            # 下载图片
            response = requests.get(img_url, headers=headers)
            # 检查响应状态码
            if response.status_code == 200:
                # 保存图片
                with open(os.path.join(folder_path, f'image_{i}.jpg'), 'wb') as f:
                    f.write(response.content)
                print(f"Image {i} saved.")
            else:
                print(f"Failed to download image {i}. Status code: {response.status_code}")
        except requests.exceptions.RequestException as e:
            # 处理下载过程中可能出现的异常
            print(f"Failed to download image {i}. Error: {e}")
