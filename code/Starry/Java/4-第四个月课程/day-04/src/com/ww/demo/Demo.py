import sys
import os
from PyQt5.QtWidgets import QApplication, QMainWindow, QPushButton, QListWidget, QVBoxLayout, QWidget, QFileDialog

class FileExplorerApp(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("文件夹内容查看器")
        self.setGeometry(300, 300, 600, 400)

        # 创建主部件和布局
        main_widget = QWidget()
        self.setCentralWidget(main_widget)
        layout = QVBoxLayout()

        # 创建选择文件夹按钮
        self.btn_select = QPushButton("选择文件夹")
        self.btn_select.clicked.connect(self.select_folder)
        layout.addWidget(self.btn_select)

        # 创建文件列表显示框
        self.file_list = QListWidget()
        layout.addWidget(self.file_list)

        main_widget.setLayout(layout)

    def select_folder(self):
        """打开文件夹选择对话框并显示内容"""
        # 清空当前列表
        self.file_list.clear()

        # 获取用户选择的文件夹路径
        folder_path = QFileDialog.getExistingDirectory(
            self,
            "选择文件夹",
            os.path.expanduser("~"),  # 默认从用户目录开始
            QFileDialog.ShowDirsOnly
        )

        # 如果用户选择了有效路径
        if folder_path:
            # 获取文件夹中的所有文件和子文件夹
            all_items = os.listdir(folder_path)

            # 按字母顺序排序
            all_items.sort()

            # 添加到列表控件
            for item in all_items:
                item_path = os.path.join(folder_path, item)

                # 添加文件/文件夹名称和图标标识
                if os.path.isfile(item_path):
                    self.file_list.addItem(f"📄 {item}")
                elif os.path.isdir(item_path):
                    self.file_list.addItem(f"📁 {item}")
                else:
                    self.file_list.addItem(f"❓ {item}")

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = FileExplorerApp()
    window.show()
    sys.exit(app.exec_())