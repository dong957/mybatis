<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2019/12/6
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>
${message}
<form id="loginForm" action="<%=request.getContextPath()%>/logins" method="post">
    <input type="text" id="username" name="username"/> <br/>
    <input type="text" id="password" name="password"/>  <br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
