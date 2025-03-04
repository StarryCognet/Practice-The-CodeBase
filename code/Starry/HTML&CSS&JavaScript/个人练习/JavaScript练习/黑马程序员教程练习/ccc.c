#include <stdio.h>

int main() {
    int num1, num2, sum;

    // 输入两个整数
    printf("请输入第一个整数: ");
    scanf("%d", &num1);
    printf("请输入第二个整数: ");
    scanf("%d", &num2);

    // 计算两个整数的和
    sum = num1 + num2;

    // 打印结果
    printf("两个整数的和是: %d\n", sum);

    return 0;
}
