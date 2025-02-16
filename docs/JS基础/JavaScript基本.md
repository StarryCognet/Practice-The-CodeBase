**教程视频：**

[bilibili](https://player.bilibili.com/player.html?bvid=BV1Y84y1L7Nn&p=74&page=74&autoplay=0)

[JS基础Day5-73-猜数字游戏_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1Y84y1L7Nn/?p=74&share_source=copy_web&vd_source=abb635653f3a8b0336fd788f2997a7c9)

# 在HTML中嵌入JavaScript的几种方法：<font style="background-color:#FBDE28;">(常用前三种)</font>
 

#### **内联脚本（Inline Script）**：  
直接在HTML文档中使用`<script>`标签嵌入JavaScript代码。
```html
<!DOCTYPE html>
<html>
<head>
    <title>Inline Script Example</title>

</head>

<body>
    <button id="myButton">Click me</button>

    <script>
        document.getElementById('myButton').onclick = function() {
            alert('Button clicked!');
        };
    </script>

</body>

</html>

```

#### **外部脚本文件（External Script File）**：  
使用`<script>`标签的`src`属性引入外部的`.js`文件。
```html
<!DOCTYPE html>
<html>
<head>
    <title>External Script Example</title>

</head>

<body>
    <button id="myButton">Click me</button>

    <script src="script.js"></script>

</body>

</html>

```

在`script.js`文件中：

```javascript
document.getElementById('myButton').onclick = function() {
    alert('Button clicked!');
};
```

#### **事件属性（Event Attributes）**：  
在HTML元素中直接使用事件属性（如`onclick`）来调用JavaScript代码。
```html
<!DOCTYPE html>
<html>
<head>
    <title>Event Attribute Example</title>

</head>

<body>
    <button id="myButton" onclick="alert('Button clicked!')">Click me</button>

</body>

</html>

```

#### **事件监听器（Event Listeners）**：  
在JavaScript代码中使用`addEventListener`方法为元素添加事件监听器。
```html
<!DOCTYPE html>
<html>
<head>
    <title>Event Listener Example</title>

</head>

<body>
    <button id="myButton">Click me</button>

    <script>
        document.getElementById('myButton').addEventListener('click', function() {
            alert('Button clicked!');
        });
    </script>

</body>

</html>

```

#### **内联事件处理器（Inline Event Handlers）**：  
类似于事件属性，但在`<script>`标签中定义函数，然后在HTML元素中调用这个函数。
```html
<!DOCTYPE html>
<html>
<head>
    <title>Inline Event Handler Example</title>

</head>

<body>
    <button id="myButton" onclick="handleClick()">Click me</button>

    <script>
        function handleClick() {
            alert('Button clicked!');
        }
    </script>

</body>

</html>

```

#### **模块脚本（Module Script）**：  
使用`<script type="module">`来引入或定义JavaScript模块。
```html
<!DOCTYPE html>
<html>
<head>
    <title>Module Script Example</title>

</head>

<body>
    <button id="myButton">Click me</button>

    <script type="module">
        import { handleClick } from './script.js';
        document.getElementById('myButton').onclick = handleClick;
    </script>

</body>

</html>

```

在`script.js`文件中：

```javascript
export function handleClick() {
    alert('Button clicked!');
}
```

这些方法可以根据不同的使用场景和需求来选择，以实现在HTML中调用JavaScript代码的目的。



# JS注释
## 单行注释
+ 符号：//
+ 作用：//右边这一行的代码会被忽略
+ 快捷键：ctrl+/

## 块注释
+ 符号：/*  */
+ 作用：在/*  和  */之间的所有内容都会被忽略
+ 快捷键：shift+ alt+a  或者  选中代码再ctrl+/



# 结束符
1. **作用:** 使用英文的;代表语句结束
2. **实际情况:** 实际开发中，可写可不写，浏览器(JavaScript 引擎) 可以自动推断语句的结束位置
3. **现状:**在实际开发中，越来越多的人主张，书写JavaScript 代码时省略结束符
4. **约定:**为了风格统一，结束符要么每句都写，要么每句都不写(按照团队要求.)

<details class="lake-collapse"><summary id="u903c84bf"><strong><span class="ne-text">JavaScript语句后面应该加分号么？（展开）</span></strong></summary><p id="ue8d6716e" class="ne-p"><img src="https://cdn.nlark.com/yuque/0/2024/png/42939896/1732866204857-e5ca5319-28f4-4933-abe1-143778899bd9.png" width="957" id="zOkem" class="ne-image"></p></details>


# JS输入输出语法
## 输出语法
##### 语法1
作用:向body内输出内容

```javascript
document.write('要出的内容')
```

##### 语法2
作用:页面弹出警告对话框

```javascript
alert('要出的内容')
```

##### 语法3
作用:控制台输出语法，程序员调试使用

```javascript
console.log('控制台打印')
```



## 输入语法
##### 语法：
```javascript
prompt('请输入您的姓名:')
```

##### 作用：
   显示一个对话框，对话框中包含一条文字信息，用来提示用户输入文字 

##### 展示：
![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1732867371256-bbeda967-dc6a-4bbc-b56b-375db8f52306.png)



# 变量
## 变量是什么
**白话:变量就是一个装东西的盒子。**

+ 通俗:变量是计算机中用来存储数据的“容器”它可以让计算机变得有记忆。

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1732868401624-aaa0cd3b-1ef8-4310-9c0c-6a85ba2b4d85.png)

+ 注意:变量不是数据本身，它们仅仅是一个用于存储数值的容器。可以理解为是一个个用来装东西的纸箱子。

## 变量的基本使用
### 声明变量
要想使用变量，首先需要创建变量(也称为声明变量或者定义变量)

#### 语法
```javascript
let 变量名
```

+ 声明变量有两部分构成:声明关键字、变量名(标识)
+ let 即关键字 (let: 允许、许可、让、要)，所谓关键字是系统提供的专门用来声明(定义)变量的词语
+ var语法被舍弃现常用let

#### 举例
```javascript
let age
```

### 变量赋值
定义了一个变量后，你就能够初始化它(赋值)。在变量名之后跟上一个“=”然后是数值。

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1732868988807-865bf5f7-94cf-4ded-a846-c352dd5eceff.png)

**<font style="color:#000000;background-color:#E7E9E8;">注意</font>****:是通过****<font style="color:#DF2A3F;">变量名</font>****来获得变量里面的数据**

### **更新变量**
变量赋值后，还可以通过简单地给它一个不同的值来更新它

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1732869455094-25ef4a9c-7a18-4984-ad7e-c72b3dcf371e.png)

注意: let 不允许多次声明一个变量。

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1732869474867-d14c1085-9cc6-4d62-b8ed-aa355d0bdae9.png)

### 声明多个变量
变量赋值后，还可以通过简单地给它一个不同的值来更新它

**语法:**多个变量中间用逗号隔开

```javascript
let age = 18, uname = 'pink'
```

**说明:**看上去代码长度更短，但并**<u><font style="color:#DF2A3F;">不推荐</font></u>**这样。为了更好的可读性，请一行只声明一个变量

```javascript
//多行变量声明有点长，但更容易阅读
let age = 18
let uname = 'pink
```

## 变量打印案例
```javascript
// 输出用户名案例
//1.用户输入
// prompt('请输入姓名')
//12.内部处理保存数据
let uname = prompt('请输入姓名')
// 3.打印输出
document.write(uname)
```

## 变量案例-交换变量的值
### 需求:
+ 有2个变量: num1 里面放的是 10，num2 里面放的是20最后变为 num1 里面放的是 20，num2 里面放的是 10

### 目的
1. 练习变量的使用
2. 为了后面冒泡排序做准备

### 分析
#### 核心思路:使用一个 临时变量 用来做中间存储
![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1732870535729-a261b978-0e7f-4827-b91f-67ba053d6e6a.jpeg)

#### 步骤:
1. 声明一个临时变量 temp
2. 把num1的值赋值给 temp
3. 把num2的值赋值给num1
4. 把temp的值给num2
5. 没了~~~~临时变量不用自动销毁

#### 代码
```javascript
let num1 = 10
let num2 = 20
let temp
//都是把右边给左边
temp = num1
num1 = num2
num2 = temp
console.log(num1, num2)
```

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1732870705273-531323e1-c3ba-4dd7-bb20-1f2831fc7ec6.png) 

## 变量的本质
**内存:**计算机中存储数据的地方，相当于一个空间

**变量本质:**是程序在内存中申请的一块用来存放数据的小空间

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1732871471433-056b81da-691b-4dc6-be5c-7ba6c48ab1c3.jpeg)

## 变量命名规则与规范
**规则:**必须遵守，不遵守报错(法律层面)

**规范:**建议，不遵守不会报错，但不符合业内通识(道德层面)

### 规则
+ **不能用关键字（关键字:有特殊含义的字符，JavaScript 内置的一些英语词汇。例如:let、var、if、for等）**
+ **只能用下划线、字母、数字、$组成，且数字不能开头**
+ **字母严格****<u><font style="color:#DF2A3F;">区分大小写</font></u>****，如 Age 和 age 是不同的变量**

### 规范
+ **起名要有意义**
+ **遵守小驼峰命名法（第一个单词首字母小写，后面每个单词首字母大写。例:userName）**

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1732871951302-b56ab9e7-3ac1-4f66-b898-dc07dff490c3.png)

## 变量let和var的区别
在较旧的lavaScript，使用关键字 var 来声明变量，而不是 let。

var 现在开发中一般不再使用它，只是我们可能再老版程序中看到它，

let 为了解决 var 的一些问题。

### var 声明:
+ 可以先使用 在声明(不合理)
+ var 声明过的变量可以重复声明(不合理)
+ 比如变量提升、全局变量、没有块级作用域等等

### 结论
**<u><font style="color:rgba(255,0,38,1);">var 就是个bug，别迷恋它了，以后声明变量我们统一使用let</font></u>**

## 数组
### 声明语法
```javascript
let 数组名 =[数据1，数据2,...,数据n]
```

#### 例
```javascript
let names =['小明','小刚','小红','小丽','小米']
```

+ 数组是按顺序保存，所以每个数据都有自己的编号
+ 计算机中的编号从0开始，所以小明的编号为0，小刚编号为1，以此类推
+ 在数组中，数据的编号也叫**<font style="color:rgba(255,0,38,1);">索引或下标</font>**
+ 数组可以存储任意类型的数据

### 取值语法
```javascript
数组名[下标]
```

#### 例
```javascript
let names =['小明','小刚','小红','小丽''小米']
names[0]//小明
names[1]//小网
```

+ 通过下标取数据
+ 取出来是什么类型的，就根据这种类型特点来访问

### 一些术语
+ **元素:**数组中保存的每个数据都叫数组元素
+ **下标:**数组中数据的编号
+ **长度:**数组中数据的个数，通过数组的length属性获得

#### 例
```javascript
let names =['小明','小刚','小红','小丽'，'小米']
console.log(names[0])//小明
console.log(names[1])//小刚
console.log(names.length)//5
```

# 常量
## 常量的基本使用
+ **概念:**使用 const 声明的变量称为“常量”
+ **使用场景:**当某个变量永远不会改变的时候，就可以使用 const 来声明，而不是let。
+ **命名规范:**和变量一致

### **常量使用:**
```javascript
//声明一个常量
const G = 9.8
//输出这个常量
console.log(G)
```

### **错误的：**
```javascript
//声明一个常量
const G=9.8
//修改常量里面的值
G =9.9
//输出这个常量
console.log(G)
```

+ **注意:****<font style="color:rgba(255,0,38,1);">常量不允许重新赋值,声明的时候必须赋值(初始化)</font>**
+ **小技巧:****<font style="color:rgba(255,0,38,1);">不需要重新赋值的数据使用const</font>**

# 数据类型
计算机世界中的万事万物都是数据。  
计算机程序可以处理大量的数据，为什么要给数据分类?

1. 更加充分和高效的利用内存
2. 也更加方便程序员的使用数据

**比如:**

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733102516029-7ea68087-c87f-46b1-b3e4-bfb885584d06.png)

## JS 数据类型整体分为两大类:
+ 基本数据类型
+ 引用数据类型

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1733102793264-9ff03c00-c848-451b-b68b-93fe63c19b7c.jpeg)

## 数据类型-数字类型(Number)
即我们数学中学习到的数字，可以是整数、小数、正数、负数。

```javascript
let age =18 // 整数
let price =88.99 //小数
```

JavaScript 中的正数、负数、小数等 统一称为 数字类型。

### 注意事项
+ **<font style="color:#DF2A3F;">JS 是弱数据类型，变量到底属于那种类型，只有赋值之后，我们才能确认</font>**
+ **<font style="color:#DF2A3F;">Java是强数据类型 例如int a=3 必须是整数</font>**

### 算术运算符
数字可以有很多操作，比如，乘法*、除法/、加法+、减法-等等，所以经常和算术运算符一起。

数学运算符也叫**算术运算符**，主要包括加、减、乘、除、取余(求模)

+ + ：求和
+ -  ：求差
+ *  ：求积
+ /  ：求商（除法）
+ % ：取余（取余数，开发中经常作为某个数字是否被整除）

### 算术运算符执行的优先级顺序
同时使用多个运算符编写程序时，会按着某种顺序先后执行，我们称为优先级

JavaScript中 优先级越高越先被执行，<font style="color:#DF2A3F;">优先级相同时以书从左向右执行</font>

+ 乘、除、取余优先级相同
+ 加、减优先级相同
+ 乘、除、取余优先级大于加、减
+ 使用()可以提升优先级
+ 总结:先乘除后加减，有括号先算括号里面的~~~

```javascript
console.log(1 + 2 * 3)// 7
console.log(10 - 8 / 2)// 6
console.log(2 % 5 + 4 * 2)// 10
```

### NaN（非数字类型）
NaN 代表一个计算错误。它是一个不正确的或者一个未定义的数学操作所得到的结果

```javascript
console.log('老师'- 2)// NaN
```

NaN 是粘性的。任何对 NaN 的操作都会返回 NaN

```javascript
console.log(NaN + 2)// NaN
```

## 数据类型-字符串类型(string)
**<font style="color:#DF2A3F;">通过单引号( ' ' )、双引号( "" )或反引号( ` )包裹的数据都叫字符串</font>**，单引号和双引号没有本质上的区别，推荐使用**<font style="color:#DF2A3F;">单引号</font>**

```javascript
let uname = '小明' // 使用单引号
let gender = "男" // 使用双引号
let goods = `小米` // 使用反引号
let tel = '13681113456'//看上去是数字，但是引号包裹了就是字符串
let str = ' ' //这种情况叫空字符串
```

### 注意事项:
1. 无论单引号或是双引号必须成对使用
2. 单引号/双引号可以互相嵌套，但是不以自已嵌套自已(口诀:外双内单，或者外单内双)
3. 必要时可以使用转义符\，输出单引号或双引号

### 字符串拼接
**场景:**+运算符 可以实现字符串的拼接

**口诀:**数字相加，字符相连

```javascript
document.write('我叫' + '刘德华')// 我叫刘德华
let uname = '刘德华'
let song = '忘情水'
document.write(uname + song) //刘德华忘情水
```

### 模板字符串
#### 使用场景
+ 拼接字符串和变量
+ 在没有它之前，要拼接变量比较麻烦

```javascript
document.write('大家好，我叫'+ name +'，今年'+ age + '岁')
```

#### 语法
+  ` ` (反引号)
+ 在英文输入模式下按键盘的tab键上方那个键(1左边那个键)
+ 内容拼接变量时，用**<u><font style="color:#DF2A3F;">${ }</font></u>**包住变量

```javascript
document.write(`大家好，我叫${name}，今年${age}岁`)
```

## 数据类型-布尔类型(boolean)
表示肯定或否定时在计算机中对应的是布尔类型数据。

它有两个固定的值 true 和 false，表示肯定的数据用 true(真)，表示否定的数据用 false(假)

```javascript
// JavaScript 好玩不?
let isCool = true
console.log(isCool)
```

## 数据类型-未定义类型(undefined)
未定义是比较特殊的类型，只有一个值 undefined。

### **什么情况出现未定义类型?**
只声明变量，不赋值的情况下，变量的默认值为 undefined，一般很少【直接】为某个变量赋值为undefined

```javascript
let age // 声明变量但是未赋值
document.write(age) //输出undefined
```

### **工作中的使用场景:**
我们开发中经常声明一个变量，等待传送过来的数据。

如果我们不知道这个数据是否传递过来，此时我们可以通过检测这个变量是不是undefined，就判断用户是否有数据传递过来。

## 数据类型-null(空类型)
JavaScript 中的 null 仅仅是一个代表“无”,“空”或“值未知”的特殊值

```javascript
let obj = null
console.log(obj) // nulL
```

### null 和 undefined 区别:
+ undefined 表示没有赋值
+ null表示赋值了，但是内容为空

### null 开发中的使用场景:
官方解释:把 null作为尚未创建的对象

大白话: 将来有个变量里面存放的是一个对象，但是对象还没创建好，可以先给个null

## 控制台输出语句和检测数据类型
### 控制台输出语句
```javascript
let age = 18
let uname ='刘德华'
let flag = false
let buy
console.log(age) //18
console.log(uname) //刘德华
console.log(flag) //false
console.log(buy) //undefined
```

+ 控制台语句经常用于测试结果来使用，
+ 可以看出数字型和布尔型颜色为蓝色，字符串和undefined颜色为灰色

### 通过<font style="color:#DF2A3F;">typeof</font>关键字检测数据类型
typeof 运算符可以返回被检测的数据类型。它支持两种语法形式:

+ 作为运算符: **<font style="color:#DF2A3F;">typeof x </font>**(常用的写法)
+ 函数形式: typeof(x)

换言之，有括号和没有括号，得到的结果是一样的，所以我们直接使用**<font style="color:#DF2A3F;">运算符</font>**的写法



# 数据类型转换
## 为什么需要类型转换？
JavaScript是弱数据类型: JavaScript也不知道变量到底属于那种数据类型，只有赋值了才清楚

坑: 使用表单、prompt 获取过来的数据默认是字符串类型的，此时就不能直接简单的进行加法运算

```javascript
console.log('10000'+'2000') //输出结果 100002000
```

此时需要转换变量的数据类型

通俗来说，就是**<font style="color:#DF2A3F;">把一种数据类型的变量转换成我们需要的数据类型</font>**

## 隐式转换
某些运算符被执行时，系统内部自动将数据类型进行转换，这种转换称为隐式转换。

### 规则:
+ +号两边只要有一个是字符串，都会把另外一个转成字符串
+ **<font style="color:#DF2A3F;">除了+以外</font>**的算术运算符 比如 - * / 等都会把数据转成数字类型

### 缺点:
+ 转换类型不明确，靠经验才能总结

### 小技巧:
+ **<font style="color:#DF2A3F;">+号作为正号解析可以转换成数字型</font>**
+ **<font style="color:#DF2A3F;">任何数据和字符串相加结果都是字符串</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733188765390-b4a71dff-09a3-452e-aee0-b4dc6b24fdf7.png)

## 显式转换
**<font style="color:#DF2A3F;">区分大小写！！！</font>**

编写程序时过度依靠系统内部的隐式转换是不严禁的，因为隐式转换规律并不清晰，大多是靠经验总结的规律。为了避免因隐式转换带来的问题，通常根逻辑需要对数据进行显示转换

### 概念:
自己写代码告诉系统该转成什么类型

### 转换为数字型
#### Number(数据)
+ 转成数字类型
+ 如果字符串内容里有非数字，转换失败时结果为 NaN(NotaNumber)即不是一个数字
+ NaN也是number类型的数据，代表非数字

#### parseInt(数据)
+ **<font style="color:#DF2A3F;">只保留整数</font>**

#### parseFloat(数据)
+ **<font style="color:#DF2A3F;">可以保留小数</font>**

# 运算符
## 赋值运算符
能够使用赋值运算符简化代码

### 赋值运算符:对变量进行赋值的运算符
#### 已经学过的赋值运算符:
 = **<font style="color:#DF2A3F;">将等号右边的值赋予给左边，要求左边必须是一个容器</font>**

#### 其他赋值运算符:
+ **+=**
+ **-=**
+ **/=**
+ **%=**

使用这些运算符可以在对变量赋值时进行快速操作

### 我们以 +=赋值运算符来举例
#### <font style="background-color:#FBDE28;">以前</font>我们让一个变量加1如何做的?
```javascript
let num = 1
num = num + 1
console.log(num) // 结果是 2
```

#### <font style="background-color:#FBDE28;">现在</font>我们有一个简单的写法
```javascript
let num = 1
num += 1
console.log(num)//结果是2
```

## 元运算符介绍
众多的JavaScript 的运算符可以根据所需表达式的个数，分为一元运算符、二元运算符、三元运算符

+ 二元运算符:

例：

```javascript
let num = 10 + 20
```

+ 一元运算符:

例： 正负号

```javascript
let num = 1
num = num + 1
```

```javascript
let num = 1
num += 1
```

## 一元运算符
我们可以有更简便的写法了

### 自增
+ 符号: ++
+ 作用:让变量的值 +1

### 自减
+ 符号: --
+ 作用:让变量的值 -1

### 使用场景:
经常用于计数来使用。比如进行10次操作，用它来计算进行了多少次了

### 自增-进阶
**自增运算符的用法:**

#### **前置自增:**
```javascript
let num = 1
++num //ilnum的值加1变2
```

+ 每执行1次，当前变量数值加1
+ 其作用相当于 num += 1

#### 后置自增
```javascript
let num = 1
num++ //ilnum的值加1变2
```

+ 每执行1次，当前变量数值加1
+ 其作用相当于 num +=1

**<font style="color:#DF2A3F;">前置自增和后置自增单独使用没有区别</font>**

### 自增-参与运算
**<font style="color:#DF2A3F;">前置自增和后置自增如果参与运算就有区别:(难点,但是了解即可)</font>**

#### 前置自增
+ 前置自增:先自加再使用(记忆口诀:++在前 **<font style="color:#DF2A3F;">先加</font>**)

```javascript
let i = 1
console.log(++i + 2) //结果是 4
//注意: i 是 2
// i先自加 1，变成2之后，在和后面的2相加
```

#### 后置自增
+ 后置自增:先使用再自加(记忆口诀:++在后后加)

```javascript
let i = 1
console.log(i++ + 2) //结果是 3
// 注意:此时的 i是1
// 先和2相加，先运算输出完毕后，i再自加是2
```

#### 但是
1. 前置自增和后置自增独立使用时二者并没有差别!
2. 一般开发中我们都是独立使用
3. **<font style="color:#DF2A3F;">后面 i++ 后置自增会使用相对较多,并且都是单独使用</font>**

#### 了解
```javascript
let i = 1
console.log(i++ + ++i + i) //等于7
          //1   +   3 + 3  = 7 
          //1+3+3=7
```

## 比较运算符
### 比较运算符的介绍
+ 使用场景:比较两个数据大小、是否相等
+ 实际运用例:
+ ![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733226152839-74972744-062d-49e5-8ba6-135f1b469815.png)

### 比较预算符号
+ >:       左边是否大于右边
+ <:       左边是否小于右边
+ >= :    左边是否大于或等于右边
+ <= :    左边是否小于或等于右边
+ <font style="color:#DF2A3F;">== :    左右两边值是否相等</font>
+ <font style="color:#DF2A3F;">=== :  左右两边是否类型和值都相等</font>
+ !== :   左右两边是否不全等
+ 比较结果为boolean类型，即只会得到 true 或false

#### 对比
+ = 单等是赋值
+ >== 是判断
+ === 是全等
+ **<font style="color:#DF2A3F;">开发中判断是否相等，强烈推荐使用===</font>**

### 比较运算符-了解
1. **字符串比较，是比较的字符对应的ASCI码**
+ 从左往右依次比较
+ 如果第一位一样再比较第二位，以此类推
+ 比较的少，了解即可
2. **NaN不等于任何值，包括它本身**
+ 涉及到"NaN“都是false
3. **尽量不要比较小数，因为小数有精度问题**
4. **不同类型之间比较会发生隐式转换**
+ 最终把数据隐式转换转成number类型再比较
+ 所以开发中，如果进行准确的比较我们**<font style="color:#DF2A3F;">更喜欢 ===</font>**或者!==

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733227259647-77df810c-9052-4789-a7ec-29bf346f9726.png)

## 逻辑运算符
![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733298359423-4968c40c-1b64-4879-ba75-c334860eab92.png)

## 运算符优先级
![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733298686129-87a177ef-d0dd-4977-82f4-356d1f2fb462.png)

+ 一元运算符里面的**<font style="color:#DF2A3F;">逻辑非优先级很高</font>**
+ **<font style="color:#DF2A3F;">逻辑与比逻辑或优先级高</font>**

### 练习
![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733298889465-a10f0885-4b55-44e5-b18b-291251b0622e.png)

#### 答案
> a = false
>
> b = true
>
> c = false
>
> d = true
>

# 语句
## 表达式和语句
### **表达式**
表达式是可以被求值的代码，JavaScript引擎会将其计算出一个结果

```javascript
x = 7
3 + 4
num++
```

### 语句:
语句是一段可以执行的代码。

比如: prompt()可以弹出一个输入框，还有 if语句 for 循环语句等等

### 区别
**<font style="color:#DF2A3F;">表达式</font>**<font style="color:#DF2A3F;">:因为表达式可被求值，所以它可以写在赋值语句的右侧。</font>

+ 表达式  num=3+4

**<font style="color:#DF2A3F;">语句</font>**<font style="color:#DF2A3F;">:而语句不一定有值，所以比如 alert()for和break 等语句就不能被用于赋值。</font>

+ alert() 弹出对话框  console.log()控制台打印输出

某些情况，也可以把表达式理解为表达式语句，因为它是在计算结果，但不是必须的成分(例如continue语句)

### 程序三大流程控制语句
+ **以前我们写的代码，写几句就从上往下执行几句，这种叫顺序结构**
+ **有的时候要根据条件选择执行代码，这种就叫分支结构**
+ **某段代码被重复执行，就叫循环结构**

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1733311460095-0b7a7901-7045-4f39-a827-5b3fc4c48f95.jpeg)

## 分支语句 （if、三元运算符、switch）
**分支语句可以让我们有****<font style="color:#DF2A3F;">选择性</font>****的执行想要的代码**

**分支语句包含:**

+ <font style="color:#DF2A3F;">lf分支语句</font>
+ 三元运算符
+ switch 语句

### if语句
**if语句有三种使用:单分支、双分支、多分支**

#### **单分支if语法**:
```javascript
if (条件) {
    满足条件要执行的代码
}
```

+ 括号内的条件为true时，进入大括号里执行代码
+ 小括号内的结果若不是布尔类型时，会发生隐式转换转为布尔类型
+ 如果大括号只有一个语句，大括号可以省略，但是，俺们不提倡这么做~

#### 双分支if语法:
```javascript
if (条件) {
    满足条件要执行的代码
} 
else {
    不满足条件执行的代码
}
```

#### 多分支if语法
**使用场景: 适合于有多个结果的时候，比如学习成绩可以分为: 优 良 中 差**

```javascript
if (条件1) {
   代码1
}
else if (条件2) {
   代码2
}
else if (条件3) {
   代码3
}
else {
   代码n
}
```

+ 先判断条件1，若满足条件1就执行代码1，其他不执行
+ 若不满足则向下判断条件2，满足条件2执行代码2，其他不执行
+ 若依然不满足继续往下判断，依次类推
+ 若以上条件都不满足，执行else里的代码n
+ 注:可以写N个条件，但这里演示只写3个

### 三元运算符
+ **使用场景:** 其实是比 if 双分支 更简单的写法，可以使用 三元表达式
+ **符号:**<font style="background-color:#FBDE28;"> </font>**<u><font style="background-color:#FBDE28;">?</font></u>**<font style="background-color:#FBDE28;"> </font>与**<font style="background-color:#FBDE28;"> </font>****<u><font style="background-color:#FBDE28;">:</font></u>**<font style="background-color:#FBDE28;"> </font>配合使用
+ **语法：**

```javascript
条件 ? 满足条件执行的代码 : 不满足条件执行的代码
```

+ 一般用来取值

#### 数字补0案例
需求:用户输入1个数，如果数字小于10，则前面进行补0，比如0903等

分析:

1. 为后期页面显示时间做铺垫 
2. 利用三元运算符 补 0计算

```javascript
// 1.用户输入
let num = prompt('请您输入一个数字:')
//2.判断输出-小于10才补0
num = num < 10 ? 0 + num : num
alert(num)
```

### switch语句
```javascript
switch (数据) {
    case 值1:
         代码1
         break
    case 值2:
         代码2
         break
    default:
         代码n
         break
}
```

#### 释义:
+ 找到跟小括号里数据**全等**的case值，并执行里面对应的代码
+ 若没有全等 **<font style="color:#DF2A3F;">===</font>** 的则执行default里的代码
+ 例: 数据若跟值2全等，则执行代码2



#### <font style="color:#DF2A3F;">注意事项</font>
1. **<font style="color:#DF2A3F;">switch case语句一般用于等值判断,不适合于区间判断</font>**
2. **<font style="color:#DF2A3F;">switch case一般需要配合break关键字使用 没有break会造成case穿透</font>**

#### 练习
![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733441802270-ad09a069-36b3-4091-ace9-9e4d4957fca6.png)

## if多分支语句和 switch的区别:
### 共同点
+ 都能实现多分支选择，多选1
+ 大部分情况下可以互换:

### 区别
+ switch..case语句通常处理case为比较**确定值**的情况，而if..slse..语句更加灵活，通常用于**范围判断**(大于，等于某个范围)。
+ switch 语句进行判断后直接执行到程序的语句，效率更高，而if.slse语句有几种判断条件，就得判断多少次
+ switch 一定要注意 必须是 === 全等，一定注意 数据类型，同时注意break否则会有穿透效果

**结论:**

+ 当分支比较少时，if..else语句执行效率高
+ 当分支比较多时，switch语句执行效率高，而且结构更清晰

## 循环语句
### 断点调试（谷歌浏览器）
作用: 学习时可以帮助更好的理解代码运行，工作时可以更快找到bug

浏览器打开调试界面

1. 按F12打开开发者工具
2. 点到sources一栏
3. 选择代码文件

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733442223308-f3e28ac4-2856-47f9-9d9f-f1a119c8e8fb.png)

### while 循环
**循环: **重复执行一些操作，**while : **在..期间，所以 **<font style="color:#DF2A3F;">while循环</font>** 就是在**<font style="color:#DF2A3F;">满足条件</font>**期间，重复执行某些代码。比如我们运行相同的代码输出5次(输出5句“我学的很棒”)

**路径:**

+ while 循环基本语法
+ while 循环三要素

#### while循环的基本语法
```javascript
while (循环条件) {
    要重复执行的代码(循环体)
}
```

**释义:**

+ 跟if语句很像，都要满足小括号里的条件为true才会进入**<font style="color:#DF2A3F;">循环体</font>** 执行代码
+ while大括号里代码执行完毕后不会跳出，而是继续回到小括号里判断条件是否满足，若满足又执行大括号里的代码，然后再回到小括号判断条件，直到括号内条件不满足，即跳出

#### while循环三要素
环的本质就是以某个变量为起始值，然后不断产生变化量，慢慢靠近终止条件的过程。所以，<font style="color:#DF2A3F;">while循环需要具备三要素:</font>

1. 变量起始值
2. 终止条件(没有终止条件，循环会一直执行，造成死循环)
3. 变量变化量(用自增或者自减)

```javascript
let i = 1
while(i <= 3) {
    document.write('我会循环三次<br>')
    i++
}
```



### for循环
#### for循环语法
**作用: **重复执行代码

**好处: **把声明起始值、循环条件、变化值写到一起，让人一目了然，它是最常使用的循环形式

```javascript
for(变量起始值; 终止条件; 变量变化量) {
   // 循环体
}
```

##### for嵌套循环
```javascript
for(外部声明记录循环次数的变量; 循环条件; 变化值) {
  
    for(内部声明记录循环次数的变量; 循环条件; 变化值) {
        循环体
    }
}
```

+ 一个循环里再套一个循环，一般用在for循环里

### 循环退出
#### 循环结束:
+ `break`:退出循环
+ `continue`:结束本次循环，继续下次循环

#### 区别:
+ `continue` 退出本次循环，一般用于排除或者跳过某一个选项的时候，可以使用continue
+ `break` 退出整个循环，一般用于结果已经得到,后续的循环不需要的时候可以使用

#### 死循环
如果不退出循环有可能会造成死循环，导致电脑卡顿

```javascript
    let i = 1
    while (i <= 3) {
      document.write('我会循环n次<br>')
    }

    for (; ;) {
      console.log(11);
      
    }
```

# 数组
## 数组是什么
**数组:** (Array)是一种可以按顺序保存数据的**<font style="color:#DF2A3F;">数据类型</font>**

为什么要数组?

+ 思考:如果我想保存一个班里所有同学的姓名怎么办?
+ **<font style="color:#DF2A3F;">场景:如果有多个数据可以用数组保存起来，然后放到一个变量中，管理非常方便</font>**

## 数组的基本使用
### 声明语法
```javascript
let 数组名 =[数据1, 数据2, .... , 数据n]
```

```javascript
let arr = new Array(数据1, 数据2, ..数据n)
```

**例**

```javascript
let names =['小明', '小刚', '小红', '小丽', '小米']
```

+ 数组是按顺序保存，所以每个数据都有自己的编号
+ 计算机中的编号从0开始，所以小明的编号为0，小刚编号为1，以此类推
+ 在数组中，数据的编号也叫**<font style="color:#DF2A3F;">索引或下标</font>**
+ 数组可以存储任意类型的数据

### 取值语法
```javascript
数组名[下标]
```

**例**

```javascript
let names =〔'小明', '小刚', '小红', '小丽', '小米']
names[0] //小明
names[1] //小刚
```

+ 通过下标取数据
+ 取出来是什么类型的，就根据这种类型特点来访问

### 一些术语
+ **元素:** 数组中保存的每个数据都叫数组元素
+ **下标: **数组中数据的编号
+ **长度:** 数组中数据的个数，通过数组的length属性获得

```javascript
let names =['小明','小刚','小红','小丽','小米']
console.log(names[0]) //小明
console.log(names[1]) //小刚
console.log(names.length) //5
```

### 遍历数组
+ 用循环把数组中每个元素都访问到，一般会用for循环遍历
+ 语法:

```javascript
for (let i = 0; i < 数组名.length; i++){
    数组名[i]
}
```

```javascript
let nums = [10,20,30,40,50]
for (let i = 0; i < nums.length; i++){
    document.write(nums[i])
}
```

## 操作数组
数组本质是数据集合,操作数据无非就是**<font style="color:#DF2A3F;"> 增 删 改 查 </font>**语法：

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1733565315343-35ac6070-5bbd-4fc5-91df-0a2a99b7a18e.png)

### 查
```javascript
数组名[第几位]
```

### 改
```javascript
数组[下标]= 新值
```

每个数据后面加数据

```javascript
let arr = ['css', 'js', 'python']
for (let i = 0; i < arr.length; i++) {
  arr[i] = arr[i] + '试试'
}
console.log(arr);
```

### 增
**<font style="color:#DF2A3F;">数组.</font>**`**<font style="color:#DF2A3F;">push()</font>**` 方法将一个或多个元素添加到数组的末尾，并返回该数组的新长度(**<font style="color:#DF2A3F;">重点</font>**)

**语法:**

```javascript
arr.push(元素1, ...,元素n)
```

**例如:**

```javascript
let arr =['red','green']
arr.push('pink')
console.log(arr) // ['red','green','pink']
```



`**<font style="color:#DF2A3F;">arr.unshift(新增的内容)</font>**`方法将一个或多个元素添加到数组的**开头**，并返回该数组的新长度

**语法:**

```javascript
arr.unshift(元素1,元素n)
```

**例如:**

```javascript
let arr = ['red', 'green']
arr.unshift('pink')
console.log(arr) //['pink','red','green']
```

```javascript
let arr = ['red','green']
arr.unshift('pink','hotpink')
console.log(arr) // ['pink',hotpink','red','green']
```

### 删
**<font style="color:#DF2A3F;">数组.</font>**`**<font style="color:#DF2A3F;">pop()</font>**`**<font style="color:#DF2A3F;"> </font>**方法从数组中删除最后一个元素，并返回该元素的值

**语法：**

```javascript
arr.pop()
```

**例如：**

```javascript
let arr = ['red', 'green']
arr.pop()
console.log(arr) // ['red']
```



**<font style="color:#DF2A3F;">数组.</font>**`**<font style="color:#DF2A3F;">shift()</font>**`**<font style="color:#DF2A3F;"> </font>**方法从数组中删除第一个元素，并返回该元素的值

**语法：**

```javascript
arr.shift()
```

**例如：**

```javascript
let arr = ['red', 'green']
arr.shift()
console.log(arr) // ['green']
```



**<font style="color:#DF2A3F;">数组.</font>**`**<font style="color:#DF2A3F;">splice()</font>**`**<font style="color:#DF2A3F;"> </font>**方法 删除指定元素

**语法:**

```javascript
arr.splice(start,deleteCount)

arr.splice(起始位置，删除几个元素)
```

解释:

**<font style="color:#DF2A3F;">start 起始位置:</font>**

+ 指定修改的开始位置(从0计数)

**<font style="color:#DF2A3F;">deletecount:</font>**

+ 表示要移除的数组元素的个数
+ 可选的。如果省略则默认从指定的起始位置删除到最后

## 数组排序
+ 数组.sort()方法可以排序
+ **语法:**

```javascript
let arr = [4,2,5,1,3]
//1.升宁排列写法
arr.sort(function(a, b) {
  return a - b
})
console.log(arr) //[1，2，3，4，5]
// 降序排列写法
arr.sort(function(a, b) {
  return b - a
})
console.log(arr) //[5，4，3，2，1]
```

# 函数
## 为什么要使用函数？
**封装：**

封装能够重复使用的部分：

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734397835958-19c2e8b8-bec3-4a0e-a092-a4b900feb9b9.png)

**什么是函数?为什么需要函数?**

+ 函数可以理解为一个 特定的代码块 容器 ，它可以完成特定的需求, 并且可以 重复 使用

**函数:**

`function`是被设计为**<font style="color:#DF2A3F;">执行特定任务</font>**的代码块

**说明:**

函数可以把具有相同或相似逻辑的代码“包裹”起来，通过函数调用执行这些被“包裹”的代码逻辑，这么做的优势是有利于**<font style="color:#DF2A3F;">精简代码方便复用。</font>**

比如 `alert()`、`prompt()`和` console.log()`都是一些 js 函数，只不过已经封装好了，我们只需要直接使用

## 函数的使用
+ **函数的声明语法**

```javascript
function 函数名() {
    函数体
}
```

+ **例**

```javascript
function sayHi() {
    document.write('hai~~')
}
```

### 函数命名规范
+ 和变量命名基本一致
+ 尽量小驼峰式命名法
+ 前缀应该为动词
+ 命名建议: 常用动词约定
+ 建议用英文命名

```javascript
function getName() {}
function addSquares () {}
```

| 动词 | 含义 |
| --- | --- |
| can | 判断是否可执行某个动作 |
| has | 判断是否含义某个值 |
| is | 判断是否为某个值 |
| get | 获取某个值 |
| set | 设置某个值 |
| load | 加载某些数据 |


### 函数的调用
```javascript
// 函数调用，这些函数体内的代码逻辑会被执行
函数名()
```

_<u>注意: 声明 (定义) 的函数必须调用才会真正被执行，使用 ( ) 调用函数</u>_

**例：**

```javascript
//函数一次声明可以多次调用，每一次函数调用函数体里面的代码会重新执行一次
sayHi()
sayHi()
```

**我们曾经使用的 alert()，parselnt()这种名字后面跟小括号的本质都是函数的调用**

### 函数体
函数体是函数的构成部分，它负责将相同或相似代码“包裹”起来，直到函数调用时函数体内的代码才会被执行。函数的功能代码都要写在函数体当中。

```javascript
// 打招呼
function sayHi() {
  console.log('嗨~');
}
sayHi()
```

### 函数传参
**思考:** 这样的函数只能求 10 + 20，这个函数功能局限非常大

```javascript
function getSum() {
    let num1 = 10
    let num2 = 20
    console.log(num1 + num2)
}
getsum()
```

**解决办法:** 把要计算的数字传到函数内

**结论:**

+ 若函数完成功能需要调用者传入数据，那么就需要用有参数的函数
+ **<font style="color:#DF2A3F;">这样可以极大提高函数的灵活性</font>**

#### 声明语法
```javascript
function 函数名(参数列表) {
   函数体
}
```

**参数列表:**

+ 传入数据列表
+ 声明这个函数需要传入几个数据
+ 多个数据用逗号隔开

**例:**

单个参数

```javascript
function getsquare(num1) {
    document.write(num1 * num1)
}
```

多个参数

```javascript
function getsum(num1, num2) {
    document.write(num1 + num2)
}
```

#### 调用语法
```javascript
函数名(传递的参数列表)
```

**例：**

```javascript
getSquare(8)
```

```javascript
getsum(10, 20)
```

**需要传入几个数据就写几个，用逗号隔开**

****

---





![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734418087335-1da5cf2a-a4e8-4eb7-aa3c-262eb7748aaf.png)

1. 形参: 声明函数时写在函数名右边小括号里的叫形参(形式上的参数)
2. 实参: 调用函数时写在函数名右边小括号里的叫实参(实际上的参数)
3. **<font style="color:#DF2A3F;">形参可以理解为是</font>**在这个函数内声明的**<font style="color:#DF2A3F;">变量</font>**(比如 `num1= 10`)实参可以理解为是给这个变量赋值
4. **<font style="color:#DF2A3F;">开发中尽量保持形参和实参个数一致</font>**
5. 我们曾经使用过的 `alert('打印')`，`parseInt('11')`，`Number('11')`本质上都是函数调用的传参

#### 参数默认值
> **1、形参: **可以看做变量，但是如果一个变量不给值，默认是什么?
>
>     **undefined**
>

---

> **2、**但是如果做用户不输入实参，刚才的案例，则出现`undefined + undefined`结果是什么?
>
>       **NaN**
>

我们可以改进下，用户不输入实参，可以给 **<font style="color:#DF2A3F;">形参默认值</font>**，可以默认为 0，这样程序更严谨，可以如下操作:

```javascript
function getSum(x = 0, y = 0) {
  document.write(x + y)
}
getsum() // 结果是0 ，而不是 N
getsum(1, 2) //结果是 3
```

:::color3
**<font style="color:#DF2A3F;">说明: </font>**<font style="color:#DF2A3F;">这个默认值只会在缺少实参参数传递时 才会被执行，所以有参数会优先执行传递过来的实参，否则默认为:</font>

<font style="color:#DF2A3F;">      </font>**<font style="color:#DF2A3F;">undefined</font>**

:::

### 函数返回值
> **1、提问: **什么是函数?
>
>       **函数是被设计为****<font style="color:#DF2A3F;">执行特定任务</font>****的代码块**
>

---

> **2、提问: **执行完特定任务之后，然后呢?
>
>       **把任务的结果给我们**
>

**缺点: **把计算后的结果处理方式写死了，内部处理了

**解决: **把处理结果返回给调用者



#### 有返回值函数的概念：
+ 当调用某个函数，这个函数会返回一个结果出来
+ 这就是有**<font style="color:#DF2A3F;">返回值</font>**的函数



其实前面已经接触了很多的函数具备返回值:

```javascript
let result = prompt('请输入你的年龄?')
let result2 = parseInt('111')
```

只是这些函数是JS底层内置的.我们直接就可以使用

当然有些函数，则没有返回值

```javascript
alert('我是弹框，不需要返回值')
```

所以要根据**<font style="color:#DF2A3F;">需求</font>**，来设定需不需要返回值



当函数需要返回数据出去时，用`return`关键字

#### 语法：
```javascript
return 数据
```

```javascript
return 20
```

#### 怎么使用呢?
```javascript
function getsum(x, y) {
    return x + y
}
let num = getSum(10, 30)
document.write(num)
```

****

#### 细节:
+ 在函数体中使用 `return` 关键字能将内部的执行结果交给函数外部使用
+ `return` 后面代码不会再被执行，会立即结束当前函数，所以<font style="color:#DF2A3F;"> </font>`return`<font style="color:#DF2A3F;"> </font>**<font style="color:#DF2A3F;">后面的数据不要换行写</font>**
+ `return`函数可以没有 `return`，这种情况函数默认返回值为 `undefined`

### 函数细节补充
两个相同的函数后面的会覆盖前面的函数

在JavaScript中 实参的个数和形参的个数可以不一致

+ 如果形参过多 会自动填上`undefined`(了解即可)
+ 如果实参过多 那么多余的实参会被忽略(函数内部有一个`arguments`,里面装着所有的实参)

函数一旦碰到`return`就不会在往下执行了，函数的结束用`return`

## 作用域
### 介绍
通常来说，一段程序代码中所用到的名字并不总是有效和可用的，而限定这个名字的**<font style="color:#DF2A3F;">可用性的代码范围</font>**就是这个名字的**<font style="color:#DF2A3F;">作用域</font>**。

作用域的使用提高了程序逻辑的局部性，增强了程序的可靠性，减少了名字冲突。

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1734577775760-ab188781-41a4-42a7-84d4-067a6c56c5b0.jpeg)

---

在**JavaScript中，根据作用域的不同，变量可以分为:**

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1734577945221-ac11651e-d86a-466c-9e93-f364cf656065.jpeg)

### 变量有一个坑，特殊情况：
如果函数内部，变量没有声明，直接赋值，也当**<font style="color:#DF2A3F;">全局变量</font>**看，但是强烈不推荐但是有一种情况，函数内部的形参可以看做是局部变量。



### 问答
> **1、JS 中作用域分为哪2种?**
>
> + 全局作用域。函数外部或者整个script有效
> + 局部作用域。也称为函数作用域，函数内部有效
>

> **2、根据作用域不同，变量分为哪2种?**
>
> + 全局变量
> + 局部变量
>

> **3、有一种特殊情况是全局变量是那种?我们提倡吗?**
>
> + 局部变量或者块级变量 没有let 声明直接赋值的当全局变量看
> + 我们强烈不提倡
> + 还有一种特殊情况，函数内部的形参可以当做局部变量看
>



### 变量的访问原则
+ 只要是代码，就至少有一个作用域
+ 写在函数内部的局部作用域
+ 如果函数中还有函数，那么在这个作用域中就又可以诞生一个作用域
+ **访问原则:** **<font style="color:#DF2A3F;">在能够访问到的情况下 先局部，局部没有在找全局</font>**

****

### 案例
#### 案例1
**结果是几？**

```javascript
function f1() {
  let num = 123
  function f2() {
    console.log( num )
  }
  f2()
}
let num = 456
f1()
```

**答：**

:::color3
**123**

:::

#### 案例2
**结果是几？**

```javascript
function f1() {
    let num = 123
    function f2() {
      let num = 0
      console.log(num)
    }
    f2()
}
let num = 456
f1()
```

**答：**

:::color3
**0**

:::

**作用域链:** 采取**<u><font style="color:#DF2A3F;">就近原则</font></u>**的方式来查找变量最终的值

#### 案例3
**结果是几？**

```javascript
let a = 1
function fn1() {
    let a = 2
    let b = '22'
    fn2()
    function fn2() {
        let a = 3
        fn3()
        function fn3() {
          let a = 4
          console.log(a) //a的值 ?
          console.log(b) //b的值 ?
      }
   }
}
fn1()
```

**答：**

:::color3
**4                  //a的值**

**'22'              //b的值**

:::



> **1、变量访问原则是什么?**
>
> + 采取**<font style="color:#DF2A3F;">就近原则</font>**的方式来查找变量最终的值
>



## 匿名函数
### 函数可以分为：
**具名函数：**

:::tips
声明:function <font style="color:#DF2A3F;">fn</font> ( )

{}

调用: fn ( )

:::

**匿名函数：**

:::tips
function ()   {}

:::

### 匿名函数：
没有名字的函数,无法直接使用。

**使用方式:**

+ 函数表达式
+ 立即执行函数

#### 函数表达式
将匿名函数赋值给一个变量，并且通过变量名称进行调用 我们将这个称为**<font style="color:#DF2A3F;">函数表达式</font>**

**语法:**

```javascript
let fn = function () {
    // 函数体
}
```

**调用:**

```javascript
fn() // 函数名()
```

其中函数的形参和实参使用跟具名函数一致

#### 使用场景：
**后期 web API 会使用：**

**旧写法：**

```html
<body>
  <button>点击我</button>
  <script>
    let btn = document.querySelector('button')
    btn.onclick = function() {
      alert('我是匿名函数')
    }
  </script>
</body>
```

**新写法：**

```html
<body>
  <button>点击我</button>
  <script>
    let btn = document.querySelector('button')
    btn.addEventListener(function() {
      alert('弹出')
    })
  </script>
</body>
```

### 立即执行函数
**场景介绍: 避免全局变量之间的污染**

**语法:**

```javascript
// 方式1
  (function() {console.log(11) })();

// 方式2
  (function() {console.log(11) }());

// 不需要调用，立即执行
```

注意: 多个立即执行函数要用`<font style="color:#DF2A3F;"> </font>**<font style="color:#DF2A3F;">;</font>** `隔开，要不然会报错



> **1、立即执行函数有什么作用?**
>
> + 防止变量污染
>

> **2、立即执行函数需要调用吗?有什么注意事项呢?**
>
> + 无需调用，立即执行，其实本质已经调用了
> + 多个立即执行函数之间用分号隔开
>

### 逻辑中断
开发中，还会见到以下的写法:

```javascript
function getSum(x, y) {
    x = x || 0
    y = y || 0
    console.log(x + y)
}
getsum(1, 2)
```

其实类似参数的默认值写法

#### 逻辑运算符里的短路
短路:只存在于 `&&` 和` || `中，当满足一定条件会让右边代码不执行

| 符号 | 短路条件 |
| :---: | :---: |
| && | 左边为false就短路 |
| || | 左边为true就短路 |


**原因: **通过左边能得到整个式子的结果，因此没必要再判断右边

**运算结果:** 无论 `&&`还是 `‖`，运算结果都是最后被执行的表达式值，一般用在变量赋值

#### 如：
```javascript
(function flexible(window, document) {
  var dpr = window.devicePixelRatio || 1
}(window, document))
```

```javascript
(function flexible(window, document) {
  // window.devicePixelRatio 获取当前设备的 dpr
  // 获取不到，则默认取值为
  // 移动端 获取为2，则执行2
  var dpr = window.devicePixelRatio || 1
}(window, document)
```

### 转换为Boolean型
#### 显式转换：
**Boolean(内容)**

**<font style="color:#DF2A3F;">记忆:  </font>**`**<font style="color:#DF2A3F;">''</font>**`**<font style="color:#DF2A3F;"> 、</font>**`**<font style="color:#DF2A3F;">0</font>**`**<font style="color:#DF2A3F;">、</font>**`**<font style="color:#DF2A3F;">undefined</font>**`**<font style="color:#DF2A3F;">、</font>**`**<font style="color:#DF2A3F;">null</font>**`**<font style="color:#DF2A3F;">、</font>**`**<font style="color:#DF2A3F;">false</font>**`**<font style="color:#DF2A3F;">、</font>**`**<font style="color:#DF2A3F;">NaN</font>**`**<font style="color:#DF2A3F;"> 转换为布尔值后都是 false , 其余则为 true</font>**

```javascript
console.log(false && 20) // false
console.log(5 < 3 && 20) // flase
console.log(undefined && 20) // undefined
console.log(nul1 && 20) // null
console.log(0 && 20) //0
console.log(10 && 20) // 20
```

```javascript
console.log(false || 20) // 20
console.log(5 < 3 || 20) // 20
console.log(undefined20) //20
console.log(null20) // 20
console.log(0 || 20) // 20
console.log(10 || 20) // 10
```

#### 隐式转换:
1. 有字符串的加法 ` "" + 1`，结果是`“1”`
2. 减法-(像大多数数学运算一样)只能用于数字，它会使空字符串""转换为 `0`
3. `null` 经过数字转换之后会变为 `0`
4. `undefined` 经过数字转换之后会变为 `NaN`

```javascript
console.log(''- 1)             // -1
console.log('pink老师' - 1)    // NaN
console.log(null + 1)          // 1
console.log(undefined + 1)     // NaN
console.log(NaN + 1)           // NaN
```

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734743807816-b123c574-0e33-4d82-b94c-af236cc0eddf.png)



# 对象
## 对象是什么？
1. 对象 (`object`) : JavaScript里的一种数据类型
2. 可以理解为是一种无序的数据集合
3. 注意数组是有序的数据集合
4. 用来描述某个事物，例如描述一个人
+     人有姓名、年龄、性别等信息、还有吃饭睡觉打代码等功能
+     如果用多个变量保存则比较散，用对象比较统一
5. 比如描述 班主任 信息:
+      静态特征(姓名, 年龄, 身高, 性别, 爱好)=>可以使用数字,字符串,数组,布尔类型等表示
+      动态行为(点名, 唱, 跳, rap)=>使用函数表示

```javascript
let obj = {
  uname: 'pink老师',
  age: 18,
  gender: '女'
}
```



> **1、对象是什么?**
>
> + 对象是一种数据类型
> + 无序的数据的集合
>

> **2、对象有什么特点?**
>
> + 无序的数据的集合
> + 可以详细的描述描述某个事物
>

## 对象使用
**目标: **掌握对象语法，用它保存多个数据

### 对象声明语法
```javascript
let 对象名 = {}
```

```javascript
let 对象名 = new object()
```

**例如：**

```javascript
// 声明了一个person的对象
let person = {}
```

实际开发中，我们多用花括号。`{}` **<font style="color:#DF2A3F;">是对象字面量</font>**

### 对象有属性和方法组成
**属性:** 信息或叫特征(名词)。比如手机尺寸、颜色、重量等.

**方法: **功能或叫行为(动词)。比如手机打电话、发短信、玩游戏..

```javascript
let 对象名 = {
    属性名: 属性值,
    方法名: 函数
}
```

### 属性
数据描述性的信息称为属性，如人的姓名、身高、年龄、性别等，一般是名词性的。

```javascript
let obj = {
 uname:'pink老师',
  age: 18,
  gender:'女'
}
```

1. 属性都是成 对出现的，包括属性名和值，它们之间使用英文 `:`分隔
2. 多个属性之间使用英文 `,`分隔
3. 属性就是依附在对象上的变量(外面是变量，对象内是属性)
4. 属性名可以使用`""`或`''`**<font style="color:#DF2A3F;">一般情况下省略</font>**，除非名称遇到特殊符号如空格、中横线等



> 1、对象属性有顺序吗?
>
> + 没有
>

> 2、属性和值用什么符号隔开?多个属性用什么隔开?
>
> + 属性和值用 `;` 隔开
> + 多个属性用 `,`逗号隔开
>

### 操作对象
对象本质是无序的数据集合，操作数据无非就是 **<font style="color:#DF2A3F;">增 删 改 查</font>** 语法:

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734766891535-6b5665de-dfa0-4b5b-b1ec-277841524e18.png)

目标:能够使用对象中的数据

#### 查
1. 声明对象，并添加了若干属性后，可以使用`.`获得对象中属性对应的值，我称之为属性访问
2. **语法:** `对象名.属性`
3. 简单理解就是获得对象里面的属性值。

```javascript
let person = {
  uname:'pink老师',
  age: 18,
  gender:'女'
}
console.log(person.uname)
console.log(person.age)
console.log(person.gender)
```

#### 改
**语法: **`对象名.属性 = 新值`

```javascript
let person = {
  uname:'pink老师',
  age: 18,
  gender:'女
}
person.gender = '男'
console.log(person.gender) // 修改了为男
console.log(person)
```

#### 增
**语法: **`对象名.新属性 = 新值`

```javascript
let person = {
  uname : 'pink老师',
  age: 18,
  gender:'女'
}
person.address = '武汉黑马'
console.log(person)
```

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734767339380-0f44b9cf-b4bb-4e1a-92dd-3a1cd3aca6f5.png)

#### 删
**语法: **`delete 对象名.属性`

```javascript
let person = {
  uname: 'pink老师',
  age: 18,
  gender:'女
}
delete person.gender // 删除 gender属性
console.log(person)
```

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734767462907-e9e7cf06-5b32-4d6c-a6e3-35cad110d688.png)



> **1、对象查语法如何写?**
>
> + 对象名.属性
>

> **2、对象改语法如何写:**
>
> + 对象名.属性 = 新值
>

> **3、对象增语法如何写:**
>
> + 对象名.新属性名 = 新值
>

```javascript
let person = {
  uname:'pink老师',
  age: 18,
  gender:'女
}
console.log(person.age) // 查语法
person.gender = '男'  // 改语法
person.address = '武汉黑马'  // 增语法
```

**<font style="color:#DF2A3F;">改</font>**和**<font style="color:#DF2A3F;">增</font>**语法一样，判断标准就是对象有没有这个属性，**<font style="color:#DF2A3F;">没有就是新增，有就是改</font>**

#### 属性-查的另外一种写法
+ 对于多词属性或则 -等属性，点操作就不能用了,
+ 我们可以采取：对象`['属性']`方式，单引号和双引号都可以

**错误的：**

```javascript
let person = {
  'user-name': 'pink老师',
  age: 18,
  gender:'女'
}
console.log(person.user-name) //NaN
```

**正确的：**

```javascript
let person = {
  'user-name':'pink老师',
  age: 18,
  gender:'女'
}
console.log(person['user-name']) //pink老师
```

+ 对象`['属性']` 方式，单引号和双引号都阔以
+ 也可以用于其他正常属性，比如:
+ `[]`语法里面的值如果不添加引号 默认会当成变量解析

**总结:**

没有必要的时候直接使用点语法，在需要解析变量的时候使用`[]`

```javascript
let person = {
  'user-name': 'pink老师',
  age: 18,
  gender:'女'
}
console.log(person['user-name']) //pink老师
console.log(person['age'])// 18
```

> **1、对象访问属性有哪两种方式?**
>
> + 点形式 `对象.属性`
> + 形式 对象`['属性']`
>

> **2、两种方式有什么区别?**
>
> + 点后面的属性名一定不要加引号
> + `[]`里面的属性名一定加引号
> + 后期不同使用场景会用到不同的写法
>

### 对象中的方法
数据行为性的信息称为方法，如跑步、唱歌等，一般是动词性的，其本质是函数。

```javascript
let person = {
    name: 'andy',
    sayHi: function() {
        document.write('hi~~')
    }
}
```

1. 方法是由方法名和函数两部分构成，它们之间使用:分隔
2. 多个属性之间使用英文 `,`分隔
3. 方法是依附在对象中的函数
4. 方法名可以使用`""`或`''`, 一般情况下省略，除非名称遇到特殊符号如空格、中横线等



+ 声明对象，并添加了若干方法后，可以使用，调用对象中函数，我称之为方法调用
+ 也可以添加形参和实参

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734780492472-5b6b859f-d5df-41e4-a750-e74e34bd8972.png)

> **1、对象访问方法是如何实现的?**
>
> + `对象.方法()`
> + `person.sayHi()`
>

> **2、对象方法可以传递参数吗?**
>
> + 可以，跟函数使用方法基本一致
>

```javascript
let person = {
    name: 'andy',
    sayHi:function() {
        document.write('hi~~')
    }
}
// 对象名.方法名()
person.sayHi()
```

### 遍历对象
#### for 遍历对象的问题
+ 对象没有像数组一样的`length`属性,所以无法确定长度
+ 对象里面是无序的键值对，没有规律，不像数组里面有规律的下标

#### 遍历对象
```javascript
let obj = {
    uname: 'andy',
    age: 18,
    sex:'男'
}
for (let k in obj) {
    console.log(k) // 打印属性名
    console.log(obj[k]) // 打印属性值
}
```

+ 一般不用这种方式遍历数组、主要是用来遍历对象
+ `for in`语法中的`k`是一个变量,在循环的过程中依次代表对象的属性名
+ 由于k是变量,所以必须使用`[]`语法解析
+ 一定记住: **<font style="color:#DF2A3F;">k</font>**是获得对象的**<font style="color:#DF2A3F;">属性名</font>**，**<font style="color:#DF2A3F;">对象名[k]</font>**是获得 **<font style="color:#DF2A3F;">属性值</font>**

> 1、遍历对象用那个语句?
>
> + `for in`
>

> 2、遍历对象中，`for k in obj`,获得对象属性是那个，获得值是那个?
>
> + 获得对象属性是 `k`
> + 获得对象值是 `obj[k]`
>

## 内置对象
<font style="color:rgb(51, 51, 51);">我们曾经使用过的 </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">console.log</font>`<font style="color:rgb(51, 51, 51);">，</font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">console</font>`<font style="color:rgb(51, 51, 51);">其实就是 JavaScript 中内置的对象，该对象中存在一个方法叫 </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">log</font>`<font style="color:rgb(51, 51, 51);">，然后调用 </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">log</font>`<font style="color:rgb(51, 51, 51);"> 这个方法，即 </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">console.log()</font>`<font style="color:rgb(51, 51, 51);">。</font>

<font style="color:rgb(51, 51, 51);">除了 </font>`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">console</font>`<font style="color:rgb(51, 51, 51);"> 对象外，JavaScritp 还有其它的内置的对象</font>

### <font style="color:rgb(51, 51, 51);">Math</font>
`<font style="color:rgb(51, 51, 51);background-color:rgb(248, 248, 248);">Math</font>`<font style="color:rgb(51, 51, 51);"> 是 JavaScript 中内置的对象，称为数学对象，这个对象下即包含了属性，也包含了许多的方法。</font>

#### <font style="color:rgb(51, 51, 51);">属性</font>
+ <font style="color:rgb(51, 51, 51);">Math.PI，获取圆周率</font>

```javascript
// 圆周率
console.log(Math.PI);
```

#### <font style="color:rgb(51, 51, 51);">方法</font>
+ <font style="color:rgb(51, 51, 51);">Math.random，生成 0 到 1 间的随机数</font>

```javascript
// 0 ~ 1 之间的随机数, 包含 0 不包含 1
Math.random()
```

+ <font style="color:rgb(51, 51, 51);">Math.ceil，数字向上取整</font>

```javascript
// 舍弃小数部分，整数部分加1
Math.ceil(3.4)
```

+ <font style="color:rgb(51, 51, 51);">Math.floor，数字向下取整</font>

```javascript
// 舍弃小数部分，整数部分不变
Math.floor(4.68)
```

+ <font style="color:rgb(51, 51, 51);">Math.round，四舍五入取整</font>

```javascript
// 取整，四舍五入原则
Math.round(5.46539)
Math.round(4.849)
```

+ <font style="color:rgb(51, 51, 51);">Math.max，在一组数中找出最大的</font>

```javascript
// 找出最大值
Math.max(10, 21, 7, 24, 13)
```

+ <font style="color:rgb(51, 51, 51);">Math.min，在一组数中找出最小的</font>

```javascript
// 找出最小值
Math.min(24, 18, 6, 19, 21)
```

+ <font style="color:rgb(51, 51, 51);">Math.pow，幂方法</font>

```javascript
// 求某个数的多少次方
Math.pow(4, 2) // 求 4 的 2 次方
Math.pow(2, 3) // 求 2 的 3 次方
```

+ <font style="color:rgb(51, 51, 51);">Math.sqrt，平方根</font>

```javascript
// 求某数的平方根
Math.sqrt(16)
```

<font style="color:rgb(51, 51, 51);">数学对象提供了比较多的方法，这里不要求强记，通过演示数学对象的使用，加深对对象的理解。</font>

[Math - JavaScript | MDN](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Math)

#### 内置对象-生成任意范围随机数
`Math.random()` 随机数函数， 返回一个0 - 1之间，并且包括0不包括1的随机小数 [0, 1）



+ 如何生成0-10的随机数呢？

```javascript
Math.floor(Math.random() * (10 + 1))
```

+ 如何生成5-10的随机数？

```javascript
Math.floor(Math.random() * (5 + 1)) + 5
```

+ 如何生成N-M之间的随机数?****

```javascript
Math.floor(Math.random() * (M - N + 1)) + N
```



# 拓展
## 术语解释
目标：知道一些术语，让自己更专业

| 术语 | 解释 | 举例 |
| :---: | :---: | :---: |
| 关键字 | 在JavaScript中有特殊意义的词汇 | let、var、function、if、else、 <br/>switch、case、break |
| 保留字 | 在目前的JavaScript中没意义，但未 <br/>来可能会具有特殊意义的词汇 | int、short、long、char |
| 标识（标识符） | 变量名、函数名的另一种叫法 | 无 |
| 表达式 | 能产生值的代码，一般配合运算符出 <br/>现 | 10 + 3、age >= 18 |
| 语句 | 一段可执行的代码 | If () for() |


## 基本数据类型和引用数据类型
目标：了解基本数据类型和引用数据类型的存储方式 

简单类型又叫做基本数据类型或者**<font style="color:#DF2A3F;">值类型</font>**，复杂类型又叫做**<font style="color:#DF2A3F;">引用类型</font>**。 

+ 值类型：简单数据类型/基本数据类型，在存储时变量中存储的是值本身，因此叫做值类型 

string ，number，boolean，undefined，null 

+ 引用类型：复杂数据类型，在存储时变量中存储的仅仅是地址（引用），因此叫做引用数据类型 通过 new 关键字创建的对象（系统对象、自定义对象），如 Object、Array、Date等

### 堆栈空间分配区别
1. 栈（操作系统）：由操作系统自动分配释放存放函数的参数值、局部变量的值等。其操作方式类似于数据结构中的栈； 

**<font style="color:#DF2A3F;">简单数据类型存放到栈里面 </font>**

2. 堆（操作系统）：存储复杂类型(对象)，一般由程序员分配释放，若程序员不释放，由垃圾回收机制回收。

**<font style="color:#DF2A3F;">引用数据类型存放到堆里面</font>**

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1734950926054-483de542-62b2-47f9-bc70-07bb527f0088.jpeg)

### 简单类型的内存分配
+ 值类型（简单数据类型）： string ，number，boolean，undefined，null 
+ l值类型变量的数据直接存放在变量（栈空间）中

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734951519168-bb0841e4-2688-439f-b26d-60bafca6fac9.png)

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1734951248734-6f269647-7b23-4388-be3b-71a952545a2d.jpeg)

### 复杂类型的内存分配
+ 引用类型（复杂数据类型）：通过 new 关键字创建的对象（系统对象、自定义对象），如 Object、Array、Date等 
+ l引用类型变量（栈空间）里存放的是地址，真正的对象实例存放在堆空间中

![](https://cdn.nlark.com/yuque/0/2024/png/42939896/1734951529484-56ccb64a-259c-4f91-8604-c403bff4d57b.png)

![画板](https://cdn.nlark.com/yuque/0/2024/jpeg/42939896/1734951501651-2b6728c8-abf6-42be-bff8-783bfa7944df.jpeg)

```javascript
let num = 10
let num2 = num
num = 20
console.log(num2) // 10



let obj1 = {
  age: 18
}
let obj2 = obj1
obj1.age = 20
console.log(obj2) // 20
```

