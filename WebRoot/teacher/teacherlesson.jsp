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
    
    <title>My JSP 'teacherlesson.jsp' starting page</title>
    
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
	width:500px;
	margin-top:30px;
	padding-top:30px;
	padding-bottom:10px;
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
	width:400px;
	height:300px;
	}
	</style>
  </head>
  
  <body>
  <div class="bg">
  <center>
  <div class="h">
  <h3>查看课程</h3></div>
  <div class="panel">
    <table border="1">
    <tr><td>课程编号</td><td>课程姓名</td><td>教师编号</td></tr>
    
    <s:iterator value="lessonList" var="c">
    <tr>
    <td><s:property value="lessonId" /></td>
    <td><s:property value="lessonName" /></td>
    <td><s:property value="teacherId" /></td>
    </tr>
    </s:iterator>
	</table><br/>
	<input type="button" name="Cancel" value="返回" onclick="javascript:history.go(-1);" class="button">
  </div>
  </center>
  </div>
  </body>
</html>
