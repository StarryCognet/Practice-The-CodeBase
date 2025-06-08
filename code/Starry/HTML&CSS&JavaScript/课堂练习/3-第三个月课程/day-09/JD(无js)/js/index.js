let jd = document.querySelectorAll('.jd')
for (let i = 0; i < jd.length; i++) {
  jd[i].addEventListener('mouseenter', function () {
    this.children[2].style.display = 'block'
  })
  jd[i].addEventListener('mouseleave', function () {
    this.children[2].style.display = 'none'
  })
}

let txt = document.querySelector('.txt')
document.querySelector('.hotwords').addEventListener('click', function (e) {
  for (let i = 0; i < this.children.length; i++) {
    this.children[i].className = ''
  }
  e.target.className = 'style-red'
  txt.placeholder = e.target.innerHTML
})

let menu = document.querySelectorAll('#menu li')
let same_box = document.querySelectorAll('.same_box')
for (let i = 0; i < menu.length; i++) {
  menu[i].addEventListener('mouseenter', function () {
    console.log(this.style.display)

    this.lastElementChild.style.display = 'block'
  })
  menu[i].addEventListener('mouseleave', function () {
    this.lastElementChild.style.display = 'none'
  })
}

let banImg = document.querySelector('.ban-img')
// let banImgWidth = document.querySelector('.ban-img img').width
let left_btn = document.querySelector('.left_btn')
let right_btn = document.querySelector('.right_btn')
let ul = document.querySelectorAll('#ul li')
let focuss = document.querySelector('.focus')
let index = 0
function nextPicture() {
  if (banImg.style.left == '-2370px') {
    banImg.style.left = '0px'
  } else {
    let newe = parseInt(banImg.style.left) - 790
    banImg.style.left = newe + 'px'
  }
  if (index == 3) {
    index = 0
  } else {
    index++
  }
  for (let i = 0; i < ul.length; i++) {
    ul[i].className = ''
  }
  ul[index].className = 'qumr'
}
function prevPicture() {
  if (banImg.style.left == '0px') {
    banImg.style.left = '-2370px'
  } else {
    let newe = parseInt(banImg.style.left) + 790
    banImg.style.left = newe + 'px'
  }
  if (index == 0) {
    index = 3
  } else {
    index--
  }
  for (let i = 0; i < ul.length; i++) {
    ul[i].className = ''
  }
  ul[index].className = 'qumr'
}
right_btn.addEventListener('click', nextPicture)
left_btn.addEventListener('click', prevPicture)
let time = setInterval(nextPicture, 1000)
focuss.addEventListener('mouseover', function () {
  clearInterval(time)
})
focuss.addEventListener('mouseout', function () {
  time = setInterval(nextPicture, 1000)
})
for (let i = 0; i < ul.length; i++) {
  ul[i].addEventListener('click', function () {
    for (let j = 0; j < ul.length; j++) {
      ul[j].className = ''
    }
    this.className = 'qumr'
    let num = 790 * parseInt(this.innerHTML) - 790
    banImg.style.left = -num + 'px'
    index = parseInt(this.innerHTML) - 1
  })
}

let tab_head_item = document.querySelectorAll('.tab_head_item')
let tab_body = document.querySelectorAll('.tab_body')
for (let i = 0; i < tab_head_item.length; i++) {
  tab_head_item[i].addEventListener('click', function () {
    for (let j = 0; j < tab_head_item.length; j++) {
      tab_head_item[j].className = 'tab_head_item'
      tab_body[j].style.display = 'none'
    }
    this.className = 'tab_head_item active'
    tab_body[i].style.display = 'block'
  })
}

let wrap = document.querySelector('.wrap')
let mend = document.querySelectorAll('.mend')
let mendImg = document.querySelector('.mend-img img').width / 2
let jishu = 0
let num1 = 0
setInterval(function () {
  if (jishu % mendImg === 0) {
    if (num1 < mend.length) {
      let kl = mend[num1].cloneNode(true)
      wrap.appendChild(kl)
      num1++
    } else {
      num1 = 0
    }
    console.log(jishu)
  }
  jishu--
  wrap.style.left = jishu + 'px'
}, 10)