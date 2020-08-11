new Vue({
    el:"#app",//接管整个页面区域
    data:{
        userList:[],
        user:{},
        ids:[]
    },
    methods:{
        //遍历操作:当加载页面时就执行此方法
        findAll(){
            //let _this=this;
            //向服务发送异步请求，获取响应数据赋值给userList
            /*
            * get(url?param=value):发送get异步请求，url:请求的服务器路径
            * then(function(rep){}):请求成功执行的方法，回调函数,rep:接收的是response对象
            *   响应的数据从response对象中去获取：rep.data
            * catch():请求失败执行的方法
            * finally():不管请求成功与否都执行的方法
            * */
          /*  axios.get("/vueDemo/user/findAll").then(function (rep) {
                //获取响应的数据
                _this.userList=rep.data;
            }).catch(function (error) {
                alert("no"+error);
            });    */
            axios.get("/vueDemo/user/findAll").then(rep =>{//箭头函数
                //获取响应的数据
                this.userList=rep.data;
            }).catch((error)=> {
                alert("no"+error);
            });
            /*
            * post(url,{key:value,key1:value1...})
            *
                axios.post("/vueDemo/user/findAll").then(function (rep) {
                    alert("ok");
                }).catch(function (error) {
                    alert("no"+error);
                });
            */

        },
        //根据id删除操作
        deleteByIds(){
            //alert(this.ids);
            //清空ids原有的数据
            this.ids=[];
            //发送get请求
            axios.get("/vueDemo/user/deleteByIds?ids="+this.ids).then(rep=>{
                this.findAll();
            });
        },
        //打开新增页面
        openSave(){
            this.user={};
           $("#myModal1").modal("show");
        },
        //实现新增功能
        save(){
           //发送post请求
            axios.post("/vueDemo/user/save","userStr="+JSON.stringify(this.user)).then(rep=>{
                this.findAll();
            });
        },
        //实现更新操作
        update(){

        },
        findById(id){
            $("#myModal").modal("show");
        }
    },
    /*
    * 钩子函数：当页面加载时，指定默认执行的方法
    * */
    created(){
        this.findAll();
    }
});