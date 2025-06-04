let intorspre = document.querySelectorAll('.intorspre li')
let list = document.querySelectorAll('.list li')
let listul = document.querySelector('.list ul')
for (let i = 0; i < list.length; i++) {
  list[i].addEventListener('click', function () {
    for (let j = 0; j < list.length; j++) {
      intorspre[j].style.display = 'none'
      list[j].className = ''
    }
    intorspre[i].style.display = 'block'
    list[i].className = 'red'
  })
}
let prev = document.querySelector('.prev')
let next = document.querySelector('.next')
let ximgWidth = listul.children[0].children[0].children[0].width
let num = 0
next.addEventListener('click', function () {
  if (num > -216) {
    num -= ximgWidth
    listul.style.left = num + 'px'
    console.log(num)
  }
})
prev.addEventListener('click', function () {
  if (num < 0) {
    num += ximgWidth
    listul.style.left = num + 'px'
    console.log(num)
  }
})

let tabmainmc = document.querySelectorAll('.tab-main-mc a')
let same8 = document.querySelectorAll('.same8')
for (let i = 0; i < tabmainmc.length; i++) {
  tabmainmc[i].addEventListener('click', function () {
    for (let j = 0; j < tabmainmc.length; j++) {
      tabmainmc[j].className = 'list8'
      same8[j].style.display = 'none'
    }
    this.className = 'list8 mc-a'
    same8[i].style.display = 'block'
  })
}

let user1 = document.querySelectorAll('.user2-four img')
let user2Three = document.querySelectorAll('.user2-three')
let redd = document.querySelectorAll('.user2-three li')
let _left = document.querySelectorAll('._left')
let _right = document.querySelectorAll('._right')
for (let i = 0; i < user2Three.length; i++) {
  user2Three[i].addEventListener('click', function (e) {
    for (let j = 0; j < redd.length; j++) {
      redd[j].className = ''
    }
    if (e.target.tagName == 'IMG') {
      user1[i].src = e.target.src
      e.target.parentNode.className = 'redd'
    }
  })
}
for (let i = 0; i < _left.length; i++) {
  let num1 = 0
  _left[i].addEventListener('click', function () {
    num1 -= 45
    user1[i].style.transform = `rotate(${num1}deg)`
    user1[i].style.transition = '0.3s all'
  })
  _right[i].addEventListener('click', function () {
    num1 += 45
    user1[i].style.transform = `rotate(${num1}deg)`
    user1[i].style.transition = '0.3s all'
  })
}
// transform: rotate()
