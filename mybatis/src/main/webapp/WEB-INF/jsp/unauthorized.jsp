<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <%
        request.setAttribute("ctx",request.getContextPath());
    %>
    <h1>未授权的操作</h1>
    <div>
        未授权的操作，请与管理员联系，或切换帐号重新<a href="${ctx}/logins">登陆</a>后再试！
    </div>
</body>
</html>
