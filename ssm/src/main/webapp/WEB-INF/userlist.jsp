<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="search.action">
      <table border="1px" width="60%" align="center" cellspacing="0" cellpadding="0" >
      
      <tr>
         <td colspan="6">
        
        <select name="type">
         
         <option value="username" >用户名</option>
         <option value="birthday">生日</option>
          <input type="text" name="val"/>
         <input type="submit" value="查询" />
        </select>
         </td>
      </tr>
   
      <tr>
            <td>ID<td>
            <td>用户名<td>
            <td>密码<td>
            <td>性别<td>
            <td>生日<td>
            <td>操作</td>
        </tr>
        
        <c:forEach items="${page.list }" var="user">
         <tr>
            <td>${user.id }<td>
            <td>${user.username }<td>
            <td>${user.password }<td>
            <td>${user.sex }<td>
            <td>${user.birthday }<td>
            <td><a href="edit.action?userid=${user.id }">修改</a>&nbsp;&nbsp;|&nbsp;&nbsp;
                <a href="delete.action?userid=${user.id }">删除</a></td>      
        </tr>
        </c:forEach>
      <tr>
         <td colspan="6" >
             <a href="search.action?pageno=1">首页</a>
             <a href="search.action?pageno=${page.prePage }">上一页</a>
             <a href="search.action?pageno=${page.nextPage }">下一页</a>
             <a href="search.action?pageno=${page.pages }">尾页</a>
         </td>
      </tr>
      </table>
      </form>
</body>
</html>