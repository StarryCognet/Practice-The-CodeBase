window.onload = function () {
  // //获取对象
  // //获取图片
  // var wrap = document.querySelector(".wrap");
  // //上一张
  // var prev = document.querySelector(".arrow_left");
  // //下一张
  // var next = document.querySelector(".arrow_right");


  // //下一张点击事件
  // next.onclick = function () {
  //   nextPic();
  // }

  // //上一张点击事件
  // prev.onclick = function () {
  //   prevPic();
  // }

  // var index = 0;    //图片的位置
  // function nextPic() {
  //   if (wrap.style.left == '-3600px') {
  //     wrap.style.left = "-1200px";
  //   } else {
  //     var newLeft = parseInt(wrap.style.left) - 600;
  //     wrap.style.left = newLeft + "px";
  //   }
  //   index++;      //没点击一次下一张图片，则index+1
  //   if (index == 5) {   //最后一张index=4，那么如果=5了，则表示应该是第一张了，即index=0
  //     index = 0;
  //   }

  //   showCircle();
  // }

  // function prevPic() {
  //   if (wrap.style.left == '0px') {
  //     wrap.style.left = "-2400px";
  //   } else {
  //     var newLeft = parseInt(wrap.style.left) + 600;
  //     wrap.style.left = newLeft + "px";
  //   }

  //   index--;      //没点击一次下一张图片，则index+1
  //   if (index == -1) {
  //     index = 4;
  //   }

  //   showCircle();
  // }

  // var play;
  // //自动播放
  // function autoPlay() {
  //   play = setInterval(function () {
  //     nextPic();
  //   }, 2000);
  // }

  // autoPlay();

  // //悬浮移入
  // wrap.onmouseover = function () {
  //   clearInterval(play)
  // }

  // //悬浮移出
  // wrap.onmouseout = function () {
  //   autoPlay();
  // }


  // //小圆点
  // var spanList = document.querySelectorAll(".buttons span");
  // function showCircle() {
  //   for (var i = 0; i < spanList.length; i++) {
  //     spanList[i].className = "";
  //   }

  //   spanList[index].className = "on";
  // }


  // for (var i = 0; i < spanList.length; i++) {
  //   spanList[i].onclick = function () {
  //     //小圆点的排他操作
  //     for (var j = 0; j < spanList.length; j++) {
  //       spanList[j].className = "";
  //     }
  //     this.className = "on";
  //     wrap.style.left = -(this.innerHTML * 600) + "px";
  //     //控制小红点跟随
  //     index = this.innerHTML - 1;
  //   }
  // }




  let arrow_left = document.querySelector('.arrow_left')
  let arrow_right = document.querySelector('.arrow_right')
  let img = document.querySelectorAll('img')
  let wrap = document.querySelector('.wrap')
  let span = document.querySelectorAll('span')
  let container = document.querySelector('.container')

  let index = 0
  function nextPic() {
    if (wrap.style.left == '-2400px') {
      wrap.style.left = '0px'
    } else {
      let nuee = parseInt(wrap.style.left) - 600
      wrap.style.left = nuee + 'px'
    }
    if (index == 4) {
      index = 0
    } else {
      index++
    }
    for (let j = 0; j < span.length; j++) {
      span[j].className = ''
    }
    span[index].className = 'on'
  }
  function prevPic() {
    if (wrap.style.left == '0px') {
      wrap.style.left = '-2400px'
    } else {
      let nuee = parseInt(wrap.style.left) + 600
      wrap.style.left = nuee + 'px'
    }
    if (index == 0) {
      index = 4
    } else {
      index--
    }
    for (let j = 0; j < span.length; j++) {
      span[j].className = ''
    }
    span[index].className = 'on'
  }
  arrow_right.addEventListener('click', nextPic)
  arrow_left.addEventListener('click', prevPic)
  let time = setInterval(nextPic, 1000)
  container.addEventListener('mouseover', function () {
    clearInterval(time)
  })
  container.addEventListener('mouseout', function () {
    time = setInterval(nextPic, 1000)
  })
  for (let i = 0; i < span.length; i++){
    span[i].addEventListener('click', function () {
      for (let j = 0; j < span.length; j++) {
        span[j].className = ''
      }
      this.className = 'on'
      let nuee = 600 * parseInt(this.innerHTML) - 600
      wrap.style.left = -nuee + 'px'
      index = parseInt(this.innerHTML) - 1
    })
  }
}