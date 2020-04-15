<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'infomupdata.jsp' starting page</title>
    
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
  <h3>修改学生信息</h3></div>
  <div class="panel">
     <s:form action="informupdata" method="post">
			<s:textfield name="studentId" label="学号" value="%{#request.stu.studentId}" readonly="true" /><br/>
			<s:textfield name="name" label="姓名" value="%{#request.stu.name}"/><br/>
			<s:textfield name="sex" label="性别" value="%{#request.stu.sex}"/><br/>
			<s:textfield name="data" type="date" label="生日" value="%{#request.stu.data}"/><br/>
			<s:textfield name="address" label="地址" value="%{#request.stu.address}"/><br/>
			<s:submit name="updata" />
		</s:form>
			</div>
  </center>
  </div>
  </body>
</html>
