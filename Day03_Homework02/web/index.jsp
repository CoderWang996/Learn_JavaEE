<%--
  Created by IntelliJ IDEA.
  User: Coder Wang
  Date: 2020/7/19
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>register</title>
  <style>
    body {
      background: url("/img/star.gif");
    }

    label {
      color: yellow;
    }

    .center {
      background: gray;
      width: 50%;
      text-align: center;
      margin: auto;
    }

    .color {
      color: yellow;
    }
  </style>
</head>
<body>
<div>
  <img src="/img/logo.png"/>
</div>
<div class="center">
  <div class="color">注册详情</div>
  <hr/>
  <form action="/Day03/Test2" method="post" autocomplete="off">
    <div>
      <label for="name">姓名：</label>
      <input type="text" name="name" id="name" value="" placeholder="在此输入姓名" required/>
    </div>
    <div>
      <label for="password">密码：</label>
      <input type="text" name="password" placeholder="在此输入密码" id="password" value="" required/>
    </div>
    <div>
      <label for="tel">手机：</label>
      <input type="tel" name="tel" placeholder="在此输入手机号" id="tel" value="" required/>
    </div>
    <div>
      <label for="email">邮箱：</label>
      <input type="email" name="email" placeholder="在此输入邮箱" id="email" value="" required/>
    </div>
    <hr/>
    <div class="color">
      <label for="gender">性别：</label>
      <input type="radio" name="gender" id="gender" value="man">男&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="radio" name="gender" value="women">女&nbsp;&nbsp;&nbsp;
      <input type="radio" name="gender" value="other">保密&nbsp;&nbsp;&nbsp;
    </div>
    <div class="color">
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <label for="hobby">爱好：</label>
      <input type="checkbox" name="hobby" id="hobby" value="girl">把妹&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="checkbox" name="hobby" value="dance">跳舞&nbsp;&nbsp;&nbsp;
      <input type="checkbox" name="hobby" value="game">打游戏&nbsp;&nbsp;&nbsp;
    </div>
    <div class="color">
      <label for="birth">出生日期：</label>
      <input type="date" name="birth" id="birth" value="">
      &nbsp;
    </div>
    <div class="color">
      &nbsp;<label for="city">所在城市：</label>
      <select id="city" name="city" class="">
        <option>请选择你所在的城市：</option>
        <optgroup label="直辖市">
          <option>北京</option>
          <option>上海</option>
          <option>广州</option>
          <option>深圳</option>
        </optgroup>
        <optgroup label="省会城市">
          <option>合肥</option>
          <option>西安</option>
          <option>武汉</option>
          <option>郑州</option>
        </optgroup>
      </select>
    </div>
    <hr/>
    <div class="color">
      <label for="desc">个性签名：</label>
      <textarea id="desc" name="desc" rows="10" cols="40" placeholder="来吧，展示！"></textarea>
    </div><hr/>
    <div class="color">
      <button type="submit">提交</button>
      <button type="reset">重置</button>
    </div>
  </form>
</div>
</body>
</html>
