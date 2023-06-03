///////////////////////////////////////////////////
//////////////  这里实现标签页的切换 
///////////////////////////////////////////////////
function initSwitchTab() {
    //1. 先获取相关的元素(标签页按钮，会话列表，好友列表)
    let tabSession = document.querySelector('.tab .tab-session');
    let tabFriend = document.querySelector('.tab .tab-friend');
    //querySelectorAll 可以同时选中多个雁，得到的结果是个数组
    // [0]就是会话列表
    // [1]就是好友列表
    let lists = document.querySelectorAll('.list');
    //2. 针对标签页按钮，注册点击事件
    //      如果是点击会话标签按钮，就把会话按钮的背景图片进行设置
    //      同时把会话列表显示出来，把好友列表隐藏
    //      如果是点击好友标签按钮，就把好友标签按钮的背景图片进行设置
    //      同时把好友列表显示出来，把会话列表进行隐藏
    tabSession.onclick = function() {
        // a) 设置图标
        tabSession.style.backgroundImage = 'url(img/会话.png)';
        tabFriend.style.backgroundImage = 'url(img/未用户.png)';
        // b) 让会话列表显示出来，把好友列表进行隐藏
        lists[0].classList = 'list';
        lists[1].classList = 'list hide';
    }
    tabFriend.onclick = function() {
        // a) 设置图标
        tabSession.style.backgroundImage = 'url(img/未会话.png)';
        tabFriend.style.backgroundImage = 'url(img/用户.png)';
        // b) 让好友列表显示，让会话列表隐藏
        lists[0].classList = 'list hide'
        lists[1].classList = 'list';
    }

}
initSwitchTab();

///////////////////////////////////////////////////
//////////////  从服务器获取到用户登录界面 
///////////////////////////////////////////////////
function getUserInfo() {
    $.ajax({
        type:'get',
        url:'userInfo',
        success: function(body) {
            //从服务器获取到数据
            //校验结果是否有效
            if(body.userId && body.userId > 0) {
                //如果结果有效，则把用户名显示到界面上
                //同时也可以记录userId 到 html 标签的属性中
                let userDiv = document.querySelector('.main .left .user');
                userDiv.innerHTML = body.username;
                userDiv.setAttribute("user-id",body.userId);
            }else {
                //如果结果无效，当前未登录，则跳转到登录页面
                alert("当前用户未登录");
                location.assign('login.html');
            }
        }
    });
}
getUserInfo();

function getFriendList() {
    $.ajax({
        type:'get',
        url:'friendList',
        success:function(body) {
            //1.先把之前的好友列表的内容给清空
            let friendListUL = document.querySelector('#friend-list');
            friendListUL.innerHTML ='';
            //2.遍历body，把服务器响应的结果，加回到当前的friend-list中
            for(let friend of body) {
                let li = document.createElement('li');
                li.innerHTML = '<h4>' + friend.friendName + '</h4>';
                //此处把friend作为一个html的自定义属性，加到lis标签上
                li.setAttribute('friend-id',friend.friendId);
                friendListUL.appendChild(li);
            }
        },
        error:function() {
            console.log('获取好友列表失败');
        }
    });
    
}