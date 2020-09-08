new Vue({
    el:"#app",
    data:{
        user:{},
        userList:[]
    },
    methods:{
        findAll:function () {
            //在当前方法中定义一个vue对象
            var vue=this;
            //发送ajax请求
            axios.get('/Vue_SSM_war/user/findAll.do')
                .then(function (response) {
                    // handle success
                    /*this.userList=response.data;//响应数据给userList赋值 但是这个this指向的是axios*/
                    vue.userList=response.data;//响应数据给userList赋值
                    console.log(response);
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
                .then(function () {
                    // always executed
                });
        },
        findById:function (userid) {
            //在当前方法中定义一个vue对象
            var vue=this;
            //发送ajax请求
            axios.get('/Vue_SSM_war/user/findById.do',{
                params:{
                    id:userid
                }
            })
                .then(function (response) {
                    // handle success
                    vue.user=response.data;//响应数据给userList赋值
                    $("#myModal").show();//显示窗口
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
                .then(function () {
                    // always executed
                });
        },
        showdown:function () {
            $("#myModal").hide();
        },
        update:function () {
            var vue=this;
            //使用post请求
            axios.post('/Vue_SSM_war/user/updateUser.do',vue.user)
                .then(function (response) {
                    vue.showdown()
                    vue.findAll();
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },
    created:function () {
        this.findAll();//当页面加载的时候触发请求，查询所有
    }
})