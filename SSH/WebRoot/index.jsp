<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <div align="center">
    
    	<form action="login" method="post">
    	  <table border="1" style="text-align:center">
    	    <tr>
    			<td colspan="2">用户登录</td>
    		</tr>
    		<tr>
    			<td>用户名</td>
    			<td><input type="text" name="user.username"></td>
    		</tr>
    		<tr>
    			<td>密码</td>
    			<td><input type="password" name="user.password"></td>
    		</tr>
    		<tr>
    			<td colspan="2"><input type="submit" value="登录">
    			<input type="reset" value="重填"></td>
    		</tr>
    	</table>
    	<s:property value="info"/>
    	</form>
    	<hr>
    	<form action="register" method="post">
    	  <table border="1" style="text-align:center">
    	    <tr>
    			<td colspan="2">用户注册</td>
    		</tr>
    		<tr>
    			<td>用户名</td>
    			<td><input type="text" name="user.username"><span style="color:red">*</span></td>
    		</tr>
    		<tr>
    			<td>密码</td>
    			<td><input type="text" name="user.password"><span  style="color:red">*</span></td>
    		</tr>
    		<tr>
    			<td>确认密码</td>
    			<td><input type="text" name="user.repassword"><span  style="color:red">*</span></td>
    		</tr>
    		<tr>
    			<td colspan="2"><input type="submit" value="注册">
    			<input type="reset" value="重填"></td>
    		</tr>
    	</table>
    	 <s:fielderror fieldName="user"/>
    	</form>
    </div>
  </body>
</html>
