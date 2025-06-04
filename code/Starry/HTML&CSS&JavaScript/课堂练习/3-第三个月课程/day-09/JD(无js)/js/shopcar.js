// 获取id为f_checked的元素
let f_checked = document.querySelector('#f_checked')
let shop_type = document.querySelectorAll('.shop_type')
let l_checked = document.querySelector('#l_checked')
let del = document.querySelector('#del')

// 删除广告
del.addEventListener('click', function () {
  this.parentNode.remove()
})
for (let i = 0; i < shop_type.length; i++) {
  // 店铺的全选功能
  function zjTrue() {
    for (let j = 0; j < top_checked.length; j++) {
      top_checked[j].checked = shop_type[i].checked
    }
  }
  // 店铺商品全选时，店铺被选中
  function quanxuan() {
    f_checked.checked = document.querySelectorAll('.shop_type:checked').length === shop_type.length
    l_checked.checked = document.querySelectorAll('.shop_type:checked').length === shop_type.length
  }
  let top_checked = shop_type[i].parentNode.nextElementSibling.querySelectorAll('.checked') //获取当前店铺下的商品
  // 点击店铺按钮
  shop_type[i].addEventListener('click', function () {
    zjTrue()
    quanxuan()
    shangpinSum()
    zongJia()
  })
  for (let j = 0; j < top_checked.length; j++) {
    // 点击每个店铺中的商品
    top_checked[j].addEventListener('click', function () {
      shop_type[i].checked = shop_type[i].parentNode.nextElementSibling.querySelectorAll('.checked:checked').length === top_checked.length
      quanxuan()
      shangpinSum()
      zongJia()
    })
  }
  // 上面全选按钮
  f_checked.addEventListener('click', function () {
    f_checked.checked === true ? (shop_type[i].checked = true) : (shop_type[i].checked = false)
    l_checked.checked = f_checked.checked
    zjTrue()
    shangpinSum()
    zongJia()
  })
  // 下面全选按钮
  l_checked.addEventListener('click', function () {
    l_checked.checked === true ? (shop_type[i].checked = true) : (shop_type[i].checked = false)
    f_checked.checked = l_checked.checked
    zjTrue()
    shangpinSum()
    zongJia()
  })
}

let nums = document.querySelectorAll('.four-border-one')
let jia = document.querySelectorAll('.add')
let jian = document.querySelectorAll('.sub')
let danj = document.querySelectorAll('.dan')
let sum = document.querySelectorAll('.sum')
let _goods = document.querySelector('#_goods')
let _tot = document.querySelector('#_tot')
let checkeds = document.querySelectorAll('.checked')
let delMany = document.querySelector('#delMany') //删除选中商品
let delet = document.querySelectorAll('.delet') //商品单个删除

function xiaoJi() {
  for (let j = 0; j < nums.length; j++) {
    sum[j].innerHTML = parseInt(danj[j].innerHTML) * nums[j].value
    sum[j].innerHTML += '.00'
  }
}
function shangpinSum() {
  let _goods = document.querySelector('#_goods')
  let checkeds = document.querySelectorAll('.checked')
  let _tot = document.querySelector('#_tot')
  let nums = document.querySelectorAll('.four-border-one')
  let sum = document.querySelectorAll('.sum')
  _goods.innerHTML = 0
  _tot.innerHTML = 0
  for (let j = 0; j < nums.length; j++) {
    if (checkeds[j].checked == true) {
      _goods.innerHTML = parseInt(_goods.innerHTML) + parseInt(nums[j].value)
      _tot.innerHTML = parseInt(_tot.innerHTML) + parseInt(sum[j].innerHTML)
    }
  }
}
shangpinSum()
for (let i = 0; i < nums.length; i++) {
  jia[i].addEventListener('click', function () {
    nums[i].value++
    xiaoJi()
    shangpinSum()
  })
  jian[i].addEventListener('click', function () {
    if (nums[i].value > 0) {
      nums[i].value--
      xiaoJi()
      shangpinSum()
    }
  })
}
for (let i = 0; i < delet.length; i++) {
  delet[i].addEventListener('click', function () {
    delet[i].parentNode.parentNode.remove()
    shangpinSum()
    let shop_type = document.querySelectorAll('.shop_type')
    for (let j = 0; j < shop_type.length; j++) {
      let lins = shop_type[j].parentNode.nextElementSibling.querySelectorAll('.checked')
      if (lins.length == 0) {
        shop_type[j].parentNode.remove()
      }
    }
  })
}
