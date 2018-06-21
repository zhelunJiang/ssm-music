<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Vue 测试实例 - 菜鸟教程(runoob.com)</title>
    <link rel="stylesheet" href="resource/style.css">
    <link rel="stylesheet" href="resource/style_log.css">
    <script src="./resource/vue.js"></script>
    <script src="./resource/axios.js"></script>
</head>
<body>
<div id="login_m">
    <div class="login_boder">
        <div class="login_padding">
            <form action="music-manager/adminLogin" name="from" method="post">
            <h2>用户名</h2>
            <label>
                <input type="text" name="username" class="txt_input txt_input2" placeholder="输入用户名">
            </label>
            <h2>密码</h2>
            <label>
                <input type="password" name="password" class="txt_input" placeholder="输入密码">
            </label>
            <p class="forgot"><a id="iforget">忘记密码?</a></p>
            <div class="rem_sub">
                <div class="rem_sub_l">
                    <input type="checkbox" name="checkbox" id="save_me">
                    <label for="checkbox">记住我</label>
                </div>
                <label>
                    <input type="submit" class="sub_button" name="button" id="button" value="登陆" style="opacity: 0.7;" >
                </label>
            </div>
            </form>
        </div>
    </div>
</div>

<script>
    new Vue({
        el: '#login_m',
        data: {
            admin:{}
        },
        methods:{
            /*handleLogin(){
                axios({
                    method:'POST',
                    url:'music-manager/adminLogin',
                    data:{
                        admin:this.admin
                    }
                }).then(response=>{
                    console.log(response)
                    if(response.data.error==1){
                        console.error("账号密码错误！")
                    }
                }).catch(response =>{
                    console.error("后台未知错误！");
                })
            }*/
        }
    })
</script>
</body>
</html>
<!--<div id="login_m">
    <div class="login_boder">
        <div class="login_padding">
            <h2>用户名</h2>
            <label>
                <input type="text"  class="txt_input txt_input2" placeholder="输入用户名" v-model="admin.username">
            </label>
            <h2>密码</h2>
            <label>
                <input type="password"  class="txt_input" placeholder="输入密码" v-model="admin.password">
            </label>
            <p class="forgot"><a id="iforget">忘记密码?</a></p>
            <div class="rem_sub">
                <div class="rem_sub_l">
                    <input type="checkbox" name="checkbox" id="save_me">
                    <label for="checkbox">记住我</label>
                </div>
                <label>
                    <input type="button" class="sub_button" name="button" id="button" value="登陆" style="opacity: 0.7;" @click="handleLogin">
                </label>
            </div>
        </div>
    </div>
</div>-->
<!--
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Wopop</title>
    <link href="./resource/style_log.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="./resource/style.css">
    <link rel="stylesheet" type="text/css" href="./resource/userpanel.css">
    <link rel="stylesheet" type="text/css" href="./resource/jquery.ui.all.css">
    <link rel="stylesheet" type="text/css" href="./resource/vue.js">
    <script src="./resource/axios.js"></script>
</head>
<body class="login" mycollectionplug="bind">
<div class="login_m">
    <div class="login_boder">
        <div class="login_padding" id="login_model">
            <h2>用户名</h2>
            <label>
                <input type="text" id="username" class="txt_input txt_input2" placeholder="输入用户名" v-model="admin.username">
            </label>
            <h2>密码</h2>
            <label>
                <input type="password" name="textfield2" id="userpwd" class="txt_input" placeholder="输入密码" v-model="admin.password">
            </label>
            <p class="forgot"><a id="iforget">忘记密码?</a></p>
            <div class="rem_sub">
                <div class="rem_sub_l">
                    <input type="checkbox" name="checkbox" id="save_me">
                    <label for="checkbox">记住我</label>
                </div>
                <label>
                    <input type="submit" class="sub_button" name="button" id="button" value="登陆" style="opacity: 0.7;" @click="handleLogin">
                </label>
            </div>
        </div>
    </div>&lt;!&ndash;login_boder end&ndash;&gt;
</div>&lt;!&ndash;login_m end&ndash;&gt;
</body>
<script>
    new Vue({
        el:'.login_m',
        data(){
            return{
                admin:{}
            }
        },
        methods:{
            handleLogin(){
                console.log("login")
                axios({
                    method:'POST',
                    url:'music-manager/login',
                    data:{
                        username:this.admin.username,
                        password:this.admin.password
                    }
                })
            }
        }
    })
</script>
</html>-->
