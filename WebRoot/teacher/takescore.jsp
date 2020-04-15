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
    
    <title>My JSP 'takescore.jsp' starting page</title>
    
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
}
	.bg{
	  background-image:
url(file:///C|/Users/lqq/Desktop/bg.jpg);
height:580px;
width:960px;
	}
	.panel{
	border: 1px solid #2f90b9;
	width:550px;
	margin-top:80px;
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
	.h{
	margin:30px;
	color:#2c9678;
	}
	.a{
	background-color:red;
	height:30px;
	width:80px;
	}
	</style>
  </head>
  
  <body>
  <div class="bg">
  <center>
  
   <div class="h">
  请给<s:property value="#session.b" />的<s:property value="#session.b" />课程评分</div>
  <div class="panel">
    <s:form action="scoreupdata" method="post"> 
    <br/>
			<s:textfield  name="score" label="请评分" />
			<s:submit  name="submit" />
		</s:form>
  	 </div>
  </center>
  </div>
  </body>
</html>
