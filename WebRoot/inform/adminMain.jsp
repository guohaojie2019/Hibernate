<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adminMain.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
		  *{
  font-family: "微软雅黑";
}
	.bg{
	  background-image:
url(file:///C|/Users/lqq/Desktop/bg.jpg);
height:580px;
width:960px;
	}
	.panel{
	border: 1px solid #2f90b9;
	width:400px;
	margin-top:30px;
	padding-top:30px;
	padding-bottom:30px;
	}
	.button{
	background-color:#b9dec9;
	width:200px;
	height:50px;
	color:#1a6840;
	border: 1px solid #2f90b9;
}
	}
	td{
	color:#2c9678;
	text-align:center;
	}
	h3{
	color:#2c9678;
	}
	.h{
	margin:50px;
	}
	</style>

  </head>
  
  <body>
  <div class="bg">
  <center>
  <div class="h">
  <h3>管理员管理</h3></div>
  <div class="panel">
 <input type="button" onclick="window.location.href='informfind'" value="操作学生信息" class="button" ><br/><br/>
  <input type="button" onclick="window.location.href='Teacherfind'" value="操作教师信息" class="button" ><br/><br/>
  <input type="button" onclick="window.location.href='lessonfind?&value=4'" value="操作课程信息" class="button" ><br/><br/>
  <input type="button" name="Cancel" value="返回" onclick="javascript:history.go(-1);" class="button" ><br/><br/>
   </div>
  </center>
  </div>
  </body>
</html>
