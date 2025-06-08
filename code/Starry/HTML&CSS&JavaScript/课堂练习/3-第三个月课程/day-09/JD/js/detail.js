window.onload = function(){
  // 点击小图切换大图
  var list_li = document.querySelectorAll('.list li')
  var intorspre = document.querySelectorAll('.intorspre li')
  for(var i=0;i<list_li.length;i++){
    list_li[i].setAttribute('index',i)
    list_li[i].onclick = function(){
      for(var i=0;i<list_li.length;i++){
        list_li[i].className = ''
        intorspre[i].style.display = 'none'
      }
      this.className = 'red'
      intorspre[this.getAttribute('index')].style.display = 'block'
    }
  }
  // 点击左右按钮移动ul
  var next = document.querySelector('.next')
  var prev = document.querySelector('.prev')
  var ul = document.querySelector('.list ul')
  var num = 0
  next.onclick = function(){
    if(num == -234){
      num = -234
    }else{
      num-=78
    }
    ul.style.left = num + 'px'
  }
  prev.onclick = function(){
    if(num==0){
      num = 0
    }else{
      num+=78
    }
    ul.style.left = num + 'px'
  }

  // 商品介绍切换
  var list8 = document.querySelectorAll('.list8')
  var same8 = document.querySelectorAll('.same8')
  for(var i=0;i<list8.length;i++){
    list8[i].setAttribute('index',i)
    list8[i].onclick = function(){
      for(var i=0;i<list8.length;i++){
        list8[i].className = 'list8'
        same8[i].style.display = 'none'
      }
      this.className = 'list8 mc-a'
      same8[this.getAttribute('index')].style.display = 'block'
    }
  }

  // 商品评价
  var user2_three = document.querySelectorAll('.user2-three li')
  console.log(user2_three)
  for(var i=0;i<user2_three.length;i++){
    user2_three[i].onclick = function(){
      for(var i=0;i<this.parentNode.children.length;i++){
        this.parentNode.children[i].className = ''
      }
      this.className = 'redd'
      // 改变大图的src   大图.路径 = 小图.路径
      this.parentNode.parentNode.nextElementSibling.lastElementChild.src = this.firstElementChild.src
    }
  }

  // 旋转
  var right = document.querySelectorAll('._right')
  var left = document.querySelectorAll('._left')
  var deg = 0
  for(var i=0;i<right.length;i++){
    right[i].onclick = function(){
      deg+=45
      this.nextElementSibling.style.transform = 'rotate('+deg+'deg)'
    }
  }

  for(var i=0;i<left.length;i++){
    left[i].onclick = function(){
      deg-=45
      this.nextElementSibling.nextElementSibling.style.transform = 'rotate('+deg+'deg)'
    }
  }
}