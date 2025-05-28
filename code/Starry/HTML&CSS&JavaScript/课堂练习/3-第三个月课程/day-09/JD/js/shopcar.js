window.onload = function(){
  // 降价提示
  var del = document.querySelector('#del')
  del.onclick = function(){
    this.parentNode.remove()
  }
  // 加减号
  var add = document.querySelectorAll('.add')
  var sub = document.querySelectorAll('.sub')

  for(var i=0;i<add.length;i++){
    add[i].onclick = function(){
      // 改变数字
      this.previousElementSibling.value++
      // 小计
      this.parentNode.parentNode.nextElementSibling.lastElementChild.innerText=this.parentNode.parentNode.previousElementSibling.lastElementChild.innerText * this.previousElementSibling.value
      Allcount()
      AllPrice()
    }
  }

  for(var i=0;i<sub.length;i++){
    sub[i].onclick = function(){
      if(this.nextElementSibling.value<=1){
        alert('最少购买一件')
        return false
      }
      // 改变数字
      this.nextElementSibling.value--
      // 小计
      this.parentNode.parentNode.nextElementSibling.lastElementChild.innerText=this.parentNode.parentNode.previousElementSibling.lastElementChild.innerText * this.nextElementSibling.value
      Allcount()
      AllPrice()
    }
  }
  // 删除功能
  var delet = document.querySelectorAll('.delet')
  for(var i=0;i<delet.length;i++){
    delet[i].onclick= function(){
      let result = confirm('确定要删除吗')
      if(result){
        this.parentNode.parentNode.remove()
      }else{
        alert('已取消删除')
      }
      Allcount()
      AllPrice()
    }
  }
  // 全选按钮
  var f_checked = document.querySelector('#f_checked')
  var l_checked = document.querySelector('#l_checked')
  // 获取店铺的按钮
  var shop_type = document.querySelectorAll('.shop_type')
  // 获取商品的按钮
  var shopInfo = document.querySelectorAll('.checked') //8ge
  // 全选功能
  f_checked.onclick = function(){
    for(var i=0;i<shop_type.length;i++){
      shop_type[i].checked = this.checked
    }
    for(var i=0;i<shopInfo.length;i++){
      shopInfo[i].checked = this.checked
    }
    l_checked.checked = this.checked
    Allcount()
    AllPrice()
  }
  // 下面的全选按钮
  l_checked.onclick = function(){
    for(var i=0;i<shop_type.length;i++){
      shop_type[i].checked = this.checked
    }
    for(var i=0;i<shopInfo.length;i++){
      shopInfo[i].checked = this.checked
    }
    f_checked.checked = this.checked
    Allcount()
    AllPrice()
  }

  // 店铺全选
  for(var i=0;i<shop_type.length;i++){
    shop_type[i].onclick = function(){
      // 思路：让当前店铺下的所有商品信息全部都选中
      // 1.获取当前店铺下所有商品的多选框
      var little_btn = this.parentNode.nextElementSibling.querySelectorAll('.checked')
      // 2.设置多选框全部选中
      for(var j=0;j<little_btn.length;j++){
        little_btn[j].checked = this.checked
      }

     fan()
     Allcount()
     AllPrice()
    }
  }
  function fan(){
    // 店铺的反选
    var count = 0
    // 循环判断所有店铺的选中状态，如果选中了那么就加1
    for(var i=0;i<shop_type.length;i++){
      if(shop_type[i].checked){
        count++
      }
    }
    // 判断数量如果等于2，就说明所有店铺都被选中了
    if(count == shop_type.length){
      l_checked.checked = true
      f_checked.checked = true
    }else{
      l_checked.checked = false
      f_checked.checked = false
    }
    Allcount()
    AllPrice()
  }
  // 商品信息的反选
  for(var i=0;i<shopInfo.length;i++){
    shopInfo[i].onclick = function(){
      // 反选功能
      // 先拿到当前点击其他兄弟元素
      var shopInfo_btn = this.parentNode.parentNode.parentNode.querySelectorAll('.checked')
      // 反选方法（计数法）
      var num = 0
      for(var i=0;i<shopInfo_btn.length;i++){
        if(shopInfo_btn[i].checked){
          num++
        }
      }
      if(num == shopInfo_btn.length){
        this.parentNode.parentNode.parentNode.previousElementSibling.children[0].checked = true
      }else{
        this.parentNode.parentNode.parentNode.previousElementSibling.children[0].checked = false
      }
      fan()
      Allcount()
      AllPrice()
    }
  }

  // 总数量
  function Allcount(){
    var _goods = document.querySelector('#_goods')
    // 每次调用时，都要重新获取一遍所有的商品信息，以确保每次都是最新的商品，否则删除掉一个后，拿到的数据还是旧的
    shopInfo = document.querySelectorAll('.checked') 
    var sum = 0
    for(var i=0;i<shopInfo.length;i++){
      if(shopInfo[i].checked){
        sum+=shopInfo[i].parentNode.parentNode.children[4].firstElementChild.children[1].value*1
      }
    }
    // 将计算出的数量赋值给总数量的标签
    _goods.innerText = sum
  }
  
  // 总价格
  function AllPrice(){
    var _tot = document.querySelector('#_tot')
    // 每次调用时，都要重新获取一遍所有的商品信息，以确保每次都是最新的商品，否则删除掉一个后，拿到的数据还是旧的
    shopInfo = document.querySelectorAll('.checked') 
    var sum = 0
    for(var i=0;i<shopInfo.length;i++){
      if(shopInfo[i].checked){
        sum+=shopInfo[i].parentNode.parentNode.children[5].lastElementChild.innerText*1
      }
    }
    // 将计算出的数量赋值给总数量的标签
    _tot.innerText = sum
  }
}