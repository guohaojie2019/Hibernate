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
    
    <title>My JSP 'teacher.jsp' starting page</title>
    
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
	width:700px;
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
	width:600px;
	height:300px;
	}
	</style>
  </head>
  <body>
  <div class="bg">
  <center>
  <div class="h">
  <h3>操作教师信息</h3></div>
  <div class="panel">
    <table border="1">
    <tr><td>教师编号</td><td>教师姓名</td><td>教师姓名</td><td>教师地址</td><td>操作</td></tr>
    
    <s:iterator value="TeacherList" var="c">
    <tr>
    <td><s:property value="teacherId" /></td>
    <td><s:property value="teacherName" /></td>
    <td><s:property value="sex" /></td>
    <td><s:property value="address" /></td>
     <td>
   	<a href="inform/teacheradd.jsp" >添加</a>
    <a href='<s:url action="Teacherdelete"><s:param name="teacherId" value="teacherId"/></s:url>'>删除</a>
    <a href='<s:url action="inform/teacherupdata.jsp"></s:url>'>修改</a>
    </td>
    </tr>
    </s:iterator>
	</table>
	</div>
  </center>
  </div>
  </body>
</html>
