let list = document.querySelectorAll('ul li')
let cont = document.querySelectorAll('.cont')
let qb = document.querySelector('.qb')

for (let i = 0; i < list.length; i++) {
  list[i].addEventListener('click', function () {
    for (let j = 0; j < list.length; j++) {
      list[j].className = ''
      cont[j].style.display = 'none'
    }
    this.className = 'jins'
    cont[i].style.display = 'block'
    if (i === 0) {
      qb.innerHTML = list[i].innerHTML + '⬇'
    } else {
      qb.innerHTML = '全部' + list[i].innerHTML + '⬇'
    }
  })
}
