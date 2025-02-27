```
.jzbox{
    opacity: 0;
    filter: blur(5px);
    transition: all 1s;
    transform: translateX(-40%);
}
.active {
    opacity: 1;
    filter: blur(0);
    transform: translateX(0);
}

.jzbox2{
    opacity: 0;
    filter: blur(5px);
    transition: all 1s;
    transform: translateX(10%);
}
.active2{
    opacity: 1;
    filter: blur(0);
    transform: translateX(0);
}
```

```arkts
const observer = new IntersectionObserver((entries) => {
  entries.forEach((entry) => {
    if (entry.isIntersecting) {
      entry.target.classList.add("active");
      entry.target.classList.add("active2");
    } else {
      entry.target.classList.remove("active");
      entry.target.classList.remove("active2");
    }
  });
});

const hiddenElements1 = document.querySelectorAll(".jzbox");
hiddenElements1.forEach((el) => observer.observe(el));

const hiddenElements2 = document.querySelectorAll(".jzbox2");
hiddenElements2.forEach((el) => observer.observe(el));
```
这段代码使用了Intersection Observer API来观察页面上的元素，当这些元素进入或离开视口时，会触发相应的回调函数。具体来说，这段代码的作用是当`.jzbox`和`.jzbox2`类元素进入视口时，给它们添加`active`和`active2`类，当它们离开视口时，移除这些类。
### 实现原理

1. **创建Intersection Observer实例**：
```javascript
const observer = new IntersectionObserver((entries) => {
```
这里创建了一个Intersection Observer实例，并传入一个回调函数。这个回调函数会在被观察的元素进入或离开视口时被调用。

1. **观察特定元素**：
```javascript
const hiddenElements1 = document.querySelectorAll(".jzbox");
hiddenElements1.forEach((el) => observer.observe(el));
const hiddenElements2 = document.querySelectorAll(".jzbox2");
hiddenElements2.forEach((el) => observer.observe(el));
```
使用`document.querySelectorAll`选择所有具有`.jzbox`和`.jzbox2`类的元素，并使用`observer.observe(el)`方法开始观察这些元素。

1. **处理回调函数**：
```javascript
entries.forEach((entry) => {
    if (entry.isIntersecting) {
        entry.target.classList.add("active");
        entry.target.classList.add("active2");
    } else {
        entry.target.classList.remove("active");
        entry.target.classList.remove("active2");
    }
});
```
当被观察的元素进入或离开视口时，回调函数会被触发。`entries`是一个包含所有被观察元素的数组。对于每个元素，如果`entry.isIntersecting`为`true`，则表示该元素已经进入视口，此时给该元素添加`active`和`active2`类；如果为`false`，则表示该元素已经离开视口，此时移除这些类。
### 用途
这种技术常用于实现懒加载、无限滚动、视口内的动画效果等场景。通过观察元素是否进入视口，可以动态地添加或移除CSS类，从而实现各种交互效果。
### 注意事项

1. **兼容性**：Intersection Observer API在较新的浏览器中才被支持，对于旧浏览器可能需要polyfill。
2. **性能**：频繁地观察大量元素可能会影响页面性能，建议根据实际需求合理选择观察的元素。
3. **配置选项**：Intersection Observer API提供了丰富的配置选项，如`root`、`rootMargin`、`threshold`等，可以根据具体需求进行调整。
