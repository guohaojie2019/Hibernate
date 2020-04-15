<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <style type="text/css">
  *{
  font-family: "微软雅黑";
  background-image:
url(file:///C:\Users\wangwang\Desktop\bg.jpg);
}
/*登陆框开始*/
.gcs-login {
  width: 470px;
  z-index: 100;
  magin:0 auto;
}
.gcs-login .gcs-login-panel{
 height: 360px;
  margin:auto;
   border: 1px solid #2f90b9;
}
.gcs-login .login-title {
  text-align: center;
  color:#8cc269;
}
.gcs-login .login-title h2 {
  letter-spacing: 10px;
}
.gcs-login-container {
  width: 100%;
  box-sizing: border-box;
  width: 100%;
  margin: 20px 0 0;
  text-align: center;
  color:#41ae3c;
}
.gcs-login .input {
  border: 1px solid #93d5dc;
  display: inline-block;
  box-sizing: border-box;
  width: 80%;
  height: 46px;
  padding-left: 10px;
  margin: 0 auto;
  font-size: 14px;
  outline: none;
  color:  #76838f;
}
.gcs-login .gcs-login-validation{
  width:80%;
  margin: 0 auto;
}
.gcs-login .validation-input{
  width: 250px;
  left: 0px;
}
.gcs-login img.validation-img{
  cursor:pointer;
  width: 125px;
  height: 45px;
  right: 0px;
}
.gcs-login .input:focus {
  outline: none;
  border: 1px solid #62a8ea;
  color:#2c9678;
}
.gcs-login .btn-login {
  border: 1px solid #83cbac;
  width: 80%;
  height: 45px;
  line-height: 45px;
  color:#8cc269;
  cursor: pointer;
  font-size: 20px;
  font-weight: bold;
}
.gcs-login .btn-login:hover{
  opacity: 0.9;
}
.a{
color:#2c9678;
}
/*登陆框结束*/
</style>

  </head>
<body>
  <center>
 <form action="login" method="post">
<div class='gcs-login'>
   <div class="gcs-login-panel">
<div class="login-title">
<h2>用户登陆</h2>
</div>
<div class="gcs-login-container">
  
     请输入账号<input class="input" name="account" /><br>
</div>
<div class="gcs-login-container">
  请输入密码<input class="input" name="password" type="password"/><br><br/>
   学生<input type="radio" name="type" value="1" />
	教师<input type="radio" name="type" value="2" />
        管理员<input type="radio" name="type" value="3" /><br>
</div>
<div class="gcs-login-container">
<input type="submit" value="立即登录" class="btn-login" />
</div>
</div>
</div>
</form>
</center>
</body>
</html>
