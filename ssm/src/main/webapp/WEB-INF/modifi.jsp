<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <form action="conform.action" method="post">
      <input type="hidden" name="id" value="${user.id }">
	 用户名：<input type="text" name="username" value="${user.username }" /><br>
           密码：<input type="password" name="password" value="${user.password }"/><br>
           性别：  <input type="radio" name="sex" value="1" />男 &nbsp;  <input type="radio" name="sex" value="0" /> 女<br>
	生日： <input type="text" name="birthday" value="${user.birthday }"/><br>
	<input type="submit" value="确认修改">
      
     </form>
</body>
</html>