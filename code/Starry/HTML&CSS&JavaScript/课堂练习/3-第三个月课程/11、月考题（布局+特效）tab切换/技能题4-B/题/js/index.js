let list = document.querySelectorAll('li')
let cont = document.querySelectorAll('.cont')

for (let i = 0; i < list.length; i++) {
  list[i].addEventListener('click', function () {
    for (let j = 0; j < list.length; j++) {
      list[j].className = ''
      cont[j].style.display = 'none'
    }
    list[i].className = 'blue'
    cont[i].style.display = 'block'
  })
}
