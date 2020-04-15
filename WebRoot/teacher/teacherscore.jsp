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
    
    <title>My JSP 'teacherscore.jsp' starting page</title>
    
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
	margin:30px;
	}
	table{
	width:450px;
	height:300px;
	}
	</style>
  </head>
  
  <body>
   <div class="bg">
  <center>
  <div class="h">
  <h3>评定成绩</h3></div>
  <div class="panel">
    <table border="1">
    <tr><td>学生编号</td><td>课程编号</td><td>分数</td><td>评分</td></tr>
    
    <s:iterator value="scoreList" var="c">
    <tr>
    
    <td><s:property value="studentId" /></td>
    <td><s:property value="iessonId" /></td>
    <td><s:property value="score" /></td>
    <td>
    
    <s:a href="scoreupdata1?&a=%{scoreId}&b=%{studentId}&c=%{iessonId}">评分</s:a>
    </td>
    </tr>
    </s:iterator>
	</table>
	 </div>
  </center>
  </div>
  </body>
</html>
