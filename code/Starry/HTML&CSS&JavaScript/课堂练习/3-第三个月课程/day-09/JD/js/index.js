window.onload = function(){
  // 头部导航隐藏显示
  var jd = document.querySelectorAll('.jd')
  // 循环添加鼠标移上事件
  for(var i=0;i<jd.length;i++){
    // onmouseover  onmouseout
    // onmouseenter  onmouseleave
    jd[i].onmouseenter = function(){
      this.children[2].style.display = 'block'
    }
    jd[i].onmouseleave = function(){
      this.children[2].style.display = 'none'
    }
  }

  // 搜索框
  var txt = document.querySelector('.txt')
  var link = document.querySelectorAll('.hotwords a')
  for(var i=0;i<link.length;i++){
    link[i].onclick = function(){
      // 排它
      for(var j=0;j<link.length;j++){
        link[j].className = ''
      }
      // 改变当前的文字颜色
      this.className = 'style-red'
      // 当前文字内容赋值给文本框
      txt.value = this.innerText
    }
  }
  // 左侧列表
  var menu = document.querySelectorAll('#menu li')
  for(var i=0;i<menu.length;i++){
    menu[i].onmouseover = function(){
      this.lastElementChild.style.display = 'block'
    }
    menu[i].onmouseout = function(){
      this.lastElementChild.style.display = 'none'
    }
  }

  // 每日特价
  var tab_head_item = document.querySelectorAll('.tab_head_item')
  var tab_body = document.querySelectorAll('.tab_body')
  for(var i=0;i<tab_head_item.length;i++){
    tab_head_item[i].setAttribute('index',i)
    tab_head_item[i].onmouseover = function(){
      // 排它
      for(var i=0;i<tab_head_item.length;i++){
        tab_head_item[i].className = 'tab_head_item'
        tab_body[i].style.display = 'none'
      }
      // 首先让当前的变红
      this.className = 'tab_head_item active'
      // 让对应的盒子显示
      tab_body[this.getAttribute('index')].style.display = 'block'
    }
    // tab_head_item[i].onmouseout = function(){
    //   // 让对应的盒子显示
    //   tab_body[this.getAttribute('index')].style.display = 'none'
    // }
  }
  // 轮播图
  var bigImg = document.querySelector('.ban-img')
  var right_btn = document.querySelector('.right_btn')
  // 右按钮功能
  right_btn.onclick = function(){
    run()
  }
  function run(){
    // 先获取原来的位置
    var step = parseInt(bigImg.style.left)
    if(step==-2370){
      step = 0
    }else{
      step-=790
    }
    // 设置大盒子向左运动
    bigImg.style.left = step +'px'
    // 排它
    for(var i=0;i<little_btn.length;i++){
      little_btn[i].className = ''
    }
    // 设置小按钮去改变
    little_btn[step/-790].className = 'qumr'
  }
  // 小圆点功能
  var little_btn = document.querySelectorAll('#ul li')
  for(var i=0;i<little_btn.length;i++){
    little_btn[i].setAttribute('index',i)
    little_btn[i].onclick = function(){
      // 排它
      for(var i=0;i<little_btn.length;i++){
        little_btn[i].className = ''
      }
      // 当前的加上被色背景（加类名）
      this.className = 'qumr'
      bigImg.style.left = this.getAttribute('index')*-790 +'px'
    }
  }
  // 自动播放
  var timer 
  function auto(){
    timer = setInterval(function(){
      run()
    },1000)
  }
  auto()
  // 鼠标移上停止定时器
  var focus = document.querySelector('.focus')
  focus.onmouseover = function(){
    clearInterval(timer)
  }

  focus.onmouseout = function(){
    // 重启定时器
    auto()
  }
  // 走马灯
  var wrap = document.querySelector('.wrap')
  wrap.innerHTML+=wrap.innerHTML
  var num = 0
  setInterval(function(){
    if(num==-990){
      num = 0
    }else{
      num-=1
    }
    wrap.style.left = num +'px'
  }, 10);
  // 为你推荐
  var list = document.querySelectorAll('#ul_list li')
  var tuijian = document.querySelectorAll('.tuijian>div')
  console.log(tuijian)
  for(var i=0;i<list.length;i++){
    list[i].setAttribute('index',i)
    list[i].onclick = function(){
      // 排它
      for(var i=0;i<list.length;i++){
        list[i].firstElementChild.firstElementChild.className = ''
        list[i].children[1].className = 'feed-tab-desc '
        tuijian[i].style.display = 'none'
      }
      // 给当前点击的添加类名
      this.firstElementChild.firstElementChild.className = 'feed-tab-title-txt'
      this.children[1].className = 'feed-tab-desc feed-tab-xh'
      // 切换对应的盒子去显示
      tuijian[this.getAttribute('index')].style.display = 'block'
    }
  }
}
