window.onload = function () {
    //轮播图
    //获取ban-img的div
    var banImg = document.querySelector(".ban-img");
    //获取下一个按钮对象
    var rightBtn = document.querySelector(".right_btn");
    //获取上一个按钮对象
    var leftBtn = document.querySelector(".left_btn");

    var index = 0;
    //下一个
    function nextPic() {
        if (banImg.style.left == -790 * 3 + "px") {
            banImg.style.left = "0px";
        } else {
            var newLeft = parseInt(banImg.style.left) - 790;
            banImg.style.left = newLeft + "px";
        }

        if (index == 3) {
            index = 0;
        } else {
            index++;
        }

        showCircle();
    }

    //上一个
    function prevPic() {
        if (banImg.style.left == "0px") {
            banImg.style.left = -790 * 3 + "px";
        } else {
            var newLeft = parseInt(banImg.style.left) + 790;
            banImg.style.left = newLeft + "px";
        }

        if (index == 0) {
            index = 3;
        } else {
            index--;
        }

        showCircle();
    }

    //下一个按钮的点击事件
    rightBtn.onclick = function () {
        nextPic();
    }

    //上一个按钮的点击事件
    leftBtn.onclick = function () {
        prevPic();
    }

    //自动播放
    var _set;
    function autoPlay() {
        _set = setInterval(nextPic, 2000);
    }

    autoPlay();


    //鼠标移入盒子
    banImg.onmouseover = function () {
        clearInterval(_set);
    }

    //鼠标移出盒子
    banImg.onmouseout = function () {
        autoPlay();
    }


    //小圆点跟随
    var liList = document.querySelectorAll("#ul li");
    function showCircle() {
        for (var i = 0; i < liList.length; i++) {
            liList[i].className = "";
        }

        liList[index].className = "qumr";
    }


    //小圆点的点击事件
    var liList = document.querySelectorAll("#ul li");
    for (var i = 0; i < liList.length; i++) {
        liList[i].onclick = function () {
            for (var j = 0; j < liList.length; j++) {
                liList[j].className = "";
                liList[j].setAttribute("index", j);
            }
            this.className = "qumr";

            var index = this.getAttribute("index");
            banImg.style.left = -790 * index + "px";
        }
    }


    //头部导航
    var jdList = document.querySelectorAll(".jd");
    for (var i = 0; i < jdList.length; i++) {
        //我的京东鼠标移入事件
        jdList[i].onmouseover = function () {
            this.children[2].style.display = "block";
        }
        //我的京东鼠标移出事件
        jdList[i].onmouseout = function () {
            this.children[2].style.display = "none";
        }
    }


    //搜索框
    var txt = document.querySelector(".txt");
    var hotwords = document.querySelector(".hotwords");
    //事件委派
    hotwords.onclick = function (e) {
        //将被点击的a链接的事件委托给父级元素
        //把a链接的文本值赋值给txt
        txt.placeholder = e.target.innerHTML;
        //排他
        for (var i = 0; i < hotwords.children.length; i++) {
            hotwords.children[i].className = "";
        }
        e.target.className = "style-red";
    }


    //左侧导航
    var liList = document.querySelectorAll("#menu li");
    for (var i = 0; i < liList.length; i++) {
        //鼠标移入事件
        liList[i].onmouseover = function () {
            this.lastElementChild.style.display = "block";
        }
        //鼠标移出事件
        liList[i].onmouseout = function () {
            this.lastElementChild.style.display = "none";
        }
    }

    //每日精选
    //获取精选文字
    var thiList = document.querySelectorAll(".tab_head_item");
    var tbList = document.querySelectorAll(".tab_body");
    for (var i = 0; i < thiList.length; i++) {
        thiList[i].onclick = function () {
            for (var j = 0; j < thiList.length; j++) {
                thiList[j].className = "tab_head_item";
                thiList[j].setAttribute("index",j);
                tbList[j].style.display = "none";
            }
            this.className = "tab_head_item active";

            var index = this.getAttribute("index") * 1;
            //下面盒子
            tbList[index].style.display = "block";
        }
    }
}